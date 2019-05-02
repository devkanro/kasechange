val multigradleVersion: String by settings
val kotlinVersion: String by settings
val githubReleaseVersion: String by settings

rootProject.name = "kcasechange"

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "kotlin-gradle-plugin")
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
            if (requested.id.id.startsWith("ru.pearx.multigradle"))
                useVersion(multigradleVersion)
            if(requested.id.id.startsWith("com.github.breadmoirai.github-release"))
                useVersion(githubReleaseVersion)
        }
    }
}