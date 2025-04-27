# UniMixins Example Mod

This is an example mod that shows how to get started with UniMixins. The buildscript uses GTNH's fork of ForgeGradle, and "modern" Gradle (6.9.1).

The following features are demonstrated:

- Basic mixin - This is all you need to mix into vanilla/Forge/coremod classes.
    - `build.gradle`
    - `mixin/MixinGuiMainMenu.java`
    - `mixins.unimixinsexample.json`
- Early mixin (GTNHMixins) - An alternative interface for "basic mixins" that provides a convenient way to detect coremods.
    - `build.gradle`
    - `mixins.unimixinsexample.early.json`
    - `ExampleCore.java`
    - `mixin/early/MixinGuiMainMenu.java`
- Late mixin (GTNHMixins) - Needed to mix into the classes of non-coremods.
    - `build.gradle`
    - `mixins.unimixinsexample.late.json`
    - `ExampleLateMixins.java`
    - `mixin/late/MixinBaubles.java`
- MixinExtras - Some extra annotations.
    - `mixin/early/MixinGuiMainMenu.java`

## Setup

You must use Java 8 to build the mod. (You can force a specific Java version in your IDE settings, or by setting the `JAVA_HOME` environmental variable if you are building from the command line.)

Building the mod:

```
./gradlew build
```

Running via Gradle:

```
./gradlew runClient
```

To run using a native IDE run configuration, you must add the following program arguments...

```
--tweakClass org.spongepowered.asm.launch.MixinTweaker --mixin mixins.unimixinsexample.json
```

...And the following JVM argument:

```
-Dfml.coreMods.load=ExampleCore
```

## License

This example mod is available under the [CC0 license](LICENSE).
