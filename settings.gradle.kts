pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    
}
rootProject.name = "multi-service-project"
include("first-service", "second-service", "shared")
