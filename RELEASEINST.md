## Release Instructions

The current release infrastructure is built into the project's [build.gradle](https://github.com/heroiclabs/nakama-java/blob/master/build.gradle). You'll need both the JDK 1.7+ and `gradle` installed to generate release packages which can be uploaded to GitHub and deployed to `"jcenter"`.

### New releases

To generate a new package run `gradle build shadowJar`. You can find the generated build artifacts in `"build/libs"`.

```
build/libs/
├── nakama-java-${version}-all.jar
└── nakama-java-${version}.jar
```

### Full release workflow

The development team use these steps to build and upload a release.

1. Update the `CHANGELOG.md`.

   Make sure to add the relevant "Added", "Changed", "Deprecated", "Removed", "Fixed", and "Security" sections as suggested by [keep a changelog](http://keepachangelog.com).

2. Update version in `build.gradle` and commit. i.e. `version = '0.1.0'` should become `version = '0.2.0'`.

   ```
   git add build.gradle CHANGELOG.md
   git commit -m "Nakama Java 0.2.0 release."
   ```

3. Tag the release.

   __Note__ In source control good semver suggests a `"v"` prefix on a version. It helps group release tags.

   ```
   git tag -a v0.2.0 -m "v0.2.0"
   git push origin v0.2.0
   ```

4. You can upload the release onto <a href="https://bintray.com/bintray/jcenter" target="\_blank">jcenter</a>. You must set the values in `"gradle.properties"` to your Bintray credentials.

   ```
   gradle -PvcsTag="v0.2.0" bintrayUpload
   ```

5. Login and create a [new draft release](https://github.com/heroiclabs/nakama-java/releases/new) on GitHub. Repeat the changelog in the release description. Then publish the release.

6. Add the previous version of the docs to the `"preserve"` closure in the build script. Deploy the latest Javadoc to GitHub Pages.

   ```
   preserve {
       include '0.1.0/**'
   }
   ```

   ```
   gradle gitPublishPush
   ```

7. Add new `## [Unreleased]` section to start of `CHANGELOG.md`. Increment version in `build.gradle` and commit. i.e. `version = '0.2.0'` should now become `version = '0.3.0'`.

   ```
   git add build.gradle CHANGELOG.md
   git commit -m "Set new development version."
   git push origin master
   ```
