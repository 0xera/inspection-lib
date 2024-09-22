plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.publish)
    alias(libs.plugins.grease)
}

mavenPublishing {
    pomFromGradleProperties()
}

android {
    namespace = "com.zeroxera.inspection.lib"
    compileSdk = 34

    defaultConfig {
        minSdk = 26
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    grease(files("libs/inspection-1.0.0.aar"))
}