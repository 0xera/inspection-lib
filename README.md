[![](https://jitpack.io/v/0xera/inspection-lib.svg)](https://jitpack.io/#0xera/inspection-lib)

Use with [Flipper Jetpack Compose plugin](https://github.com/facebook/flipper/tree/2b3184f48ad4bd88cc2c706396f36edc6c40fdbf/android/plugins/jetpack-compose)


```kotlin
dependencyResolutionManagement {
    repositories {
        maven("https://jitpack.io")
    }
}

dependencies {
    modules {
        module("flipper:inspection-lib") {
            replacedBy("com.github.0xera:inspection-lib")
        }
    }

    implementation("com.github.0xera:inspection-lib:1.0.0")
    implementation("com.facebook.flipper:flipper-jetpack-compose-plugin:0.267.1")
    
    // or

    implementation("com.github.0xera:inspection-lib:1.0.0")
    implementation("com.facebook.flipper:flipper-jetpack-compose-plugin:0.267.1") {
        exclude(group = "flipper", module = "inspection-lib")
    }
}
```