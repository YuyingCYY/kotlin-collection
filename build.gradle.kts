plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "io.yuying"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("script-runtime"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}


application {
    mainClass.set("MainKt")
}