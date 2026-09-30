plugins {
    kotlin("jvm") version "2.3.21"
}

group = "io.github.thisismeamir"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

tasks.test {
    useJUnitPlatform()
}
