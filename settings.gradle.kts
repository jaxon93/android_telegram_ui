pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "android_telegram_ui"
include(":app")
include(":telegram_contacts_kotlin")
include(":telegram_notifications_kotlin")
include(":telegram_appearance_kotlin")
include(":telegram_main_java")
include(":telegram_contacts_java")
include(":telegram_notifications_java")
include(":telegram_appearance_java")
