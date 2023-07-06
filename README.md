Nakama Java
===========

> Android optimized Java client for Nakama server.

[Nakama](https://github.com/heroiclabs/nakama) is an open-source server designed to power modern games and apps. Features include user accounts, chat, social, matchmaker, realtime multiplayer, and much [more](https://heroiclabs.com).

This client implements the full API and socket options with the server. It's written in C# with minimal dependencies to support Unity, Xamarin, Godot, XNA, and other engines and frameworks.

Full documentation is online - https://heroiclabs.com/docs

## Getting Started

You'll need to setup the server and database before you can connect with the client. The simplest way is to use Docker but have a look at the [server documentation](https://github.com/heroiclabs/nakama#getting-started) for other options.

1. Install and run the servers. Follow these [instructions](https://heroiclabs.com/docs/install-docker-quickstart).

2. The Java SDK can be imported with either Grade or Maven through [Jitpack](https://jitpack.io/).

### Gradle

```groovy

repositories {
    maven {
        url 'https://jitpack.io'
    }
}

dependencies {
    implementation 'com.github.heroiclabs.nakama-java:nakama-java:<commit>'

 // or, depend on the fat Jar which bundles all of the Nakama Java dependencies into a single Jar.
 // implementation 'com.github.heroiclabs.nakama-java:nakama-java-all:<commit>'
}

```

### Maven

```xml
  <repositories>
    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>
  </repositories>

  ...
  <dependencies>
    <dependency>
      <groupId>com.github.heroiclabs.nakama-java</groupId>
      <artifactId>nakama-java</artifactId>
      <version>_commit_</version>
      <type>jar</type>
    </dependency>
  </dependencies>

```

Or, if you would like to depend on a fat JAR with Maven:

```xml
  <dependencies>
    <dependency>
      <groupId>com.github.heroiclabs.nakama-java</groupId>
      <artifactId>nakama-java-all</artifactId>
      <version>_commit_</version>
      <type>jar</type>
    </dependency>
  </dependencies>
```

Alternatively, you can download the client from the [releases page](https://github.com/heroiclabs/nakama-java/releases) and import it into your project. You can also [build from source](#source-builds).

You can view full integration examples in the examples folder.

3. Use the connection credentials to build a client object.

```java
import com.heroiclabs.nakama.Client;

public class NakamaSessionManager {
  private final Client client;

  public NakamaSessionManager() {
    client = new DefaultClient("defaultkey", "127.0.0.1", 7349, false);
  }
}
```

## Usage

The client object has many methods to execute various features in the server or open realtime socket connections with the server.

### Authenticate

There's a variety of ways to [authenticate](https://heroiclabs.com/docs/authentication) with the server. Authentication can create a user if they don't already exist with those credentials. It's also easy to authenticate with a social profile from Google Play Games, Facebook, Game Center, etc.

```java
String email = "super@heroes.com";
String password = "batsignal";
Session session = client.authenticateEmail(email, password).get();
System.out.println(session);
```

### Sessions

When authenticated the server responds with an auth token (JWT) which contains useful properties and gets deserialized into a `Session` object.

```java
System.out.println(session.getAuthToken()); // raw JWT token
System.out.println(session.getUserId());
System.out.println(session.getUsername());
System.out.println("Session has expired: " + session.isExpired());
System.out.println("Session expires at: " + session.getExpireTime());
```

It is recommended to store the auth token from the session and check at startup if it has expired. If the token has expired you must reauthenticate. The expiry time of the token can be changed as a setting in the server.

```java
String authtoken = "restored from somewhere";
Session session = DefaultSession.restore(authtoken);
if (session.isExpired()) {
    System.out.println("Session has expired. Must reauthenticate!");
}
```

### Requests

The client includes lots of builtin APIs for various features of the game server. These can be accessed with the async methods. It can also call custom logic as RPC functions on the server. These can also be executed with a socket object.

All requests are sent with a session object which authorizes the client.

```java
Account account = client.getAccount(session);
System.out.println(account.getUser().getId());
System.out.println(account.getUser().getUsername());
System.out.println(account.getWallet());
```

### Socket

The client can create one or more sockets with the server. Each socket can have it's own event listeners registered for responses received from the server.

```java
String host = "localhost";
int port = 7350; // different port to the main API port
boolean ssl = false;
SocketClient socket = client.createSocket(host, port, ssl);
ClientListener listener = new AbstractClientListener() {
  @Override
  public void onDisconnect(final Throwable t) {
      System.out.println("Socket disconnected");
  }
};
socket.connect(session, listener).get();
System.out.println("Socket connected successfully.");
```

By default, all socket messages are processed in a single thread. Advanced users who want to pass a multithreaded `ExecutorService` to the `client.createSocket` method should be aware that incoming messages will not necessarily be processed in order by that socket.

# Satori

Satori is a liveops server for games that powers actionable analytics, A/B testing and remote configuration. Use the Satori Java Client to communicate with Satori from your Java game or server.

Full documentation is online - https://heroiclabs.com/docs/satori/client-libraries/java/index.html

## Getting Started

Create a client object that accepts the API you were given as a Satori customer.

```java TODO rewrite in Java
using Satori;

const string scheme = "https";
const string host = "127.0.0.1"; // add your host here
const int port = 443;
const string apiKey = "apiKey"; // add the api key that was given to you as a Satori customer.

var client = new Client(scheme, host, port, apiKey);
```

Then authenticate with the server to obtain your session.


```java TODO rewrite in Java
// Authenticate with the Satori server.
try
{
    session = await client.AuthenticateAsync(id);
    Debug.Log("Authenticated successfully.");
}
catch(ApiResponseException ex)
{
    Debug.LogFormat("Error authenticating: {0}", ex.Message);
}
```

Using the client you can get any experiments or feature flags, the user belongs to.

```java TODO rewrite in Java
var experiments = await client.GetExperimentsAsync(session);
var flag = await client.GetFlagAsync(session, "FlagName");
```

You can also send arbitrary events to the server:

```java TODO rewrite in Java

await client.EventAsync(session, new Event("gameLaunched", DateTime.UtcNow));

```
This is only a subset of the Satori client API, so please see the documentation link listed earlier for the [full API](https://java.docs.heroiclabs.com/html/namespace_satori.html).

### For Android

Android uses a permissions system which determines which platform services the application will request to use and ask permission for from the user. The client uses the network to communicate with the server so you must add the "INTERNET" permission.

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

## Contribute

To build the codebase you will need to install these dependencies:

* Java Runtime Environment 1.8 through 1.11
* Java Development Kit 1.8 through 1.11

Invoke the Gradle Wrapper with `./gradlew build nakamaJar` or `./gradlew build satoriJar` and Gradle will install your dependencies over
the network for you prior to building. It will then make a build and run the full test suite.

To test a specific test, run `./gradlew test --tests <ClassName.methodName>`

You can also run `./gradlew tasks` for a list of available build tasks.

To create a fat JAR with self-contained dependencies, run:

`./gradlew shadow nakamaJar` or `./gradlew shadow satoriJar`.

All JAR artifacts are output to `build/libs`. The fat JAR will have an `-all` suffix.

If you'd like to test a Jitpack publish task locally prior to pushing, run:

`./gradlew publishToMavenLocal`

### Protobuf Sourcing

If you need to re-download all .proto dependenies, run `./download-protos` from the root of this repository.

### Jitpack

Jitpack makes builds of each commit on its own servers. You can view the results of each build and the corresponding artifacts at the following url:

https://jitpack.io/com/github/heroiclabs/nakama-java/<_commit_>/build.log


## Generate Docs

API docs are generated with javadoc and deployed to GitHub pages.

When changing the API comments, rerun javadoc and commit the changes in `docs/*`.

To run javadoc:

```
cd nakama-java/src/main/com/heroiclabs/nakama
javadoc *.java
```

### License

This project is licensed under the [Apache-2 License](https://github.com/heroiclabs/nakama-dotnet/blob/master/LICENSE).
