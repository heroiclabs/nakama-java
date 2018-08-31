Nakama Java
===========

> Android optimized Java client for Nakama server.

Nakama is an [open-source](https://github.com/heroiclabs/nakama) distributed server for social and realtime games and apps. For more information have a look at the [documentation](https://heroiclabs.com/docs/).

This client implements the protocol and all features available in the server. It is compatible with Java 1.7+ and Android 2.3+. The [Javadocs](https://heroiclabs.github.io/nakama-java/current/) for the client are maintained on GitHub Pages.

If you encounter any issues with the server you can generate diagnostics for us with the [doctor](https://heroiclabs.com/docs/install-server-cli/#doctor) subcommand. Send these to support@heroiclabs.com or [open an issue](https://github.com/heroiclabs/nakama/issues). If you experience any issues with the client, it can be useful to [enable trace](https://heroiclabs.com/docs/android-java-client-guide/#logs-and-errors) to produce detailed logs and [open an issue](https://github.com/heroiclabs/nakama-java/issues).

## Usage

The client can be downloaded from [GitHub releases](https://github.com/heroiclabs/nakama-java/releases). You can download "nakama-java-$version.jar" or "nakama-java-$version-all.jar" which includes a shadowed copy of all dependencies.

If you use a build tool like Gradle you can skip the download and fetch it from the central repository.

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
```

We have a guide which covers how to use the client with lots of code examples:

https://heroiclabs.com/docs/android-java-client-guide/

To create a client which can connect to the Nakama server with the default settings.

```java
import com.heroiclabs.nakama.Client;

public class NakamaSessionManager {
  private final Client client;

  public NakamaSessionManager() {
    client = new DefaultClient("defaultkey", "127.0.0.1", 7349, false);
  }
}
```

### For Android

Android uses a permissions system which determines which platform services the application will request to use and ask permission for from the user. The client uses the network to communicate with the server so you must add the "INTERNET" permission.

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

## Contribute

To build the codebase you will need to install these dependencies:

* Java Runtime Environment 1.7+
* Java Development Kit 1.7+
* Gradle build tool

* Protoc v3.6.0+
* [Protoc Java Lite compiler](https://github.com/google/protobuf/blob/master/java/lite.md)

```shell
protoc -I./ -I/usr/local/include -I$GOPATH/src -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway --javalite_out=./ --plugin=grpc api.proto
```

The Gradle project is setup to download and manage the Google Protocol buffers compiler toolchain automatically and generate Protobuf Lite definitions required by the source code.

```
$> gradle build
```

Run "gradle tasks" for a list of available build tasks.
