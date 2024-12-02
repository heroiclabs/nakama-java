# Change Log

All notable changes to this project are documented below.

The format is based on [keep a changelog](http://keepachangelog.com/) and this project uses [semantic versioning](http://semver.org/).

## [2.5.3] - 2024-12-02

### Added
- Add option to specify own dispatcher for socket connectivity.

## [2.5.2] - 2024-10-27

### Changed
- WebSocketClient now closes the thread executor service if internal executor was used once the socket is closed.
- Improve client and socket disconnection process.

### Fixed
- Corrected Channel Type enum values to match the protocol.
- Session logout function no longer attempts to renew the token after logout.
- WebSocket client resources are released immediately after disconnection and are made ready again in case of reconnection.

## [2.5.1] - 2024-10-16

### Changed
- Include generated Protobuf code in the repository to allow CI tools to build the codebase without Buf tooling. 

## [2.5.0] - 2024-10-14

### Added
- Updated SDK to add functionality for APIs in Nakama 3.23 and Satori 2.0.
- Added auto-refresh logic for the session token in Nakama and Satori.  

### Changed
- Moved Protobuf build tooling to use Buf, and simplify the Gradle build scripts.
- Various dependency upgrades.

## [2.4.0] - 2023-07-25

### Added
- Added ability to create a new Session from a Signing Key for server-to-server calls. See `Session.fromSigningKey()`.

## [2.3.0] - 2023-07-18

### Added
- Satori: Adds HTTP support to the Satori client via using the `HttpClient` instead of the grpc-based `DefaultClient`.
- Satori: Added ability to specify default flag value in `GetFlag` calls.

### Fixed
- Satori: Fixed handling of network errors when calling `GetDefaultFlag` and returning of default flag value in such cases.

## [2.2.1] - 2023-07-07
### Fixed
- Fixed packing of external dependencies into fat jars.
- Removed unnecessary generated protobuf code from Satori, resulting in a smaller .jar file.
- Fixed links to documentation in pom.xml.

## [2.2.0] - 2023-07-06
### Added
- Adds the Satori Java SDK. Satori is our liveops server for game studios. Please read more about it on the Heroic Labs website.

### Changed
- Update shadow to 8.1.1
- Update to Gradle 8.2.0.

## [2.1.4] - 2021-4-20
### Fixed
- protobuf-lite is now properly exported to Maven and Gradle projects.

## [2.1.3] - 2021-3-16
### Fixed
- Dispatch error callback when socket connect fails.

## [2.1.2] - 2021-3-16
### Fixed
- Properly enable protobuf-javalite for Android builds.

## [2.1.1] - 2021-02-17
### Changed
- Allowed null values of `collationId` to be passed to the `DefaultError` object.

## [2.1.0] - 2020-01-25

### Added
- Added configurable ping frame intervals to Web Socket.
- Ability to demote group users.
- Ability to authenticate link and unlink Facebook Instant Game and Apple users
- Example Android, Gradle and Maven projects.
- Shadow Jar support.
- Ability to customize the web socket message receive thread executor.

### Changed
- We now use JitPack as our new build repository. Please see the README.md
for instructions on how to integrate our package with your build system.
- Removed transitive dependency on Protobuf-Java.
- Moved all external .proto dependencies into this repository.
- Upgraded from Gradle 4 to Gradle 6.
- Upgraded third party dependencies to newer versions.

### Fixed
- Fixed incorrect time being parsed from timestamps.
- Fixed bugs in Tournaments test suite.
- Fixed UTC parsing.

## [2.0.4] - 2020-01-23
### Added
- Updated gRPC, GSON and Lombok dependencies.

## [2.0.3] - 2019-10-25
### Added
- More ways to create a socket connection.

### Fixed
- Correctly decode UserPresence from payload.

## [2.0.2] - 2019-10-14
### Added
- Add support for session vars.
- Add support for sending metadata when joining a match with an ID.
- Add pagination support for friends and groups.

## [2.0.1] - 2019-06-19
### Added
- Add support for listing expired leaderboard/tournament records.

## [2.0.0] - 2019-03-29
### Added
- Support for Nakama 2.

## [0.5.1] - 2017-12-07
### Fixed
- Build storage update messages with valid operations.

## [0.5.0] - 2017-11-21
### Added
- Support for In-App Notifications feature.
- Support for Friends feature.
- Support for Groups feature.

### Changed
- Leaderboard sort order is now exposed as an enum rather than a number.

### Fixed
- Use correct name for inconsistently defined topic leave message builder method.

## [0.4.0] - 2017-11-07
### Changed
- Expose a simpler interface for identifier fields.

## [0.3.0] - 2017-10-17
### Added
- Advanced Matchmaking with custom filters and user properties.

### Fixed
- Improved errors to contain the underlying error reason.

## [0.2.0] - 2017-09-24
### Added
- Leaderboard messages.
- Matchmaking messages.
- Match messsages.
- Match presence updates.
- Topic messages.
- Topic presence updates.

## [0.1.2] - 2017-09-02
### Fixed
- Pin transitive SLF4J dependency on 1.7.* stable release.
- Use "okio.ByteString" rather than "java.util.Base64" for base64 support.

## [0.1.1] - 2017-08-14
### Fixed
- Correctly expose builder functions to external packages.

## [0.1.0] - 2017-08-13
### Added
- Initial public release.

