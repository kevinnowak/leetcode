plugins {
    id("java")
    id("com.diffplug.spotless") version "6.25.0"
}

group = "com.github.kevinnowak"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    java {
        target("src/**/*.java")
        googleJavaFormat("1.35.0").aosp()
        removeUnusedImports()
        trimTrailingWhitespace()
        endWithNewline()
        indentWithSpaces(4)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.11.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
}

tasks.test {
    useJUnitPlatform()
}