/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("buildlogic.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":lib"))
}

application {
    // Define the main class for the application.
    mainClass = "dev.wary.app.AppKt"
}

// Enable console input
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}