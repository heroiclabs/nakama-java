Nakama Java
===========

> Android optimized Java client for Nakama server.

[Nakama](https://github.com/heroiclabs/nakama) is an open-source server designed to power modern games and apps. Features include user accounts, chat, social, matchmaker, realtime multiplayer, and much [more](https://heroiclabs.com).

This client implements the full API and socket options with the server. It's written in C# with minimal dependencies to support Unity, Xamarin, Godot, XNA, and other engines and frameworks.

Full documentation is online - https://heroiclabs.com/docs

## Getting Started

You'll need to setup the server and database before you can connect with the client. The simplest way is to use Docker but have a look at the [server documentation](https://github.com/heroiclabs/nakama#getting-started) for other options.

1. Install and run the servers. Follow these [instructions](https://heroiclabs.com/docs/install-docker-quickstart).

2. Download the client from the [releases page](https://github.com/heroiclabs/nakama-java/releases) and import it into your project. You can also [build from source](#source-builds).

<!-- Alternatively, if you use a build tool like Gradle you can skip the download and fetch it from the central repository.

```groovy
repositories {
    maven {
        url 'https://dl.bintray.com/heroiclabs/default/'
    }
}

dependencies {
  compile(group: 'com.heroiclabs.nakama', name: 'client', version: '+')
  compile('org.slf4j:slf4j-api:1.7.25') {
    force = true // don't upgrade to "1.8.0-alpha2"
  }
}
``` -->

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

### For Android

Android uses a permissions system which determines which platform services the application will request to use and ask permission for from the user. The client uses the network to communicate with the server so you must add the "INTERNET" permission.

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

## Contribute

To build the codebase you will need to install these dependencies:

* Java Runtime Environment 1.8+
* Java Development Kit 1.8+

Invoke the Gradle Wrapper with `./gradlew build` and Gradle will install your dependencies over
the network for you prior to building. It will then make a build and run the full test suite.

To test a specific test, run `./gradlew test --tests <ClassName.methodName>`

You can also run `./gradlew tasks` for a list of available build tasks.

To create a fat JAR with self-contained dependencies, run:

`./gradlew shadow`

All JAR artifacts are output to `build/libs`. The fat JAR will have an `-all` suffix.

### Protobuf Sourcing

If you need to re-download all .proto dependenies, run `./download-protos` from the root of this repository.

### License

This project is licensed under the [Apache-2 License](https://github.com/heroiclabs/nakama-dotnet/blob/master/LICENSE).
