pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android") {
                useModule("com.android.tools.build:gradle:4.1.0-alpha04")
            }
            if (requested.id.namespace == "org.jetbrains.kotlin") {
                useVersion("1.3.71")
            }
        }
    }
}

include(":app")