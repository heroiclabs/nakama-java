# Change Log

All notable changes to this project are documented below.

The format is based on [keep a changelog](http://keepachangelog.com/) and this project uses [semantic versioning](http://semver.org/).

## [Unreleased]

## [2.2.0] - 2023-07-06
### Changed
- Updated grpc to 1.56 and protobuf-lite to 3.22.3.
- Adds the Satori Java SDK. Satori is our liveops server for game studios. Please read more about it on the Heroic Labs website.

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

