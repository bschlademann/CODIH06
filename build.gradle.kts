plugins {
    id("java")
    id("info.solidsoft.pitest") version "1.19.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
    testImplementation("pl.pragmatists:JUnitParams:1.1.1")
    testImplementation("com.codeborne:selenide:7.16.2")
}

tasks.test {
    useJUnit()
}

pitest {
    targetClasses.set(listOf("_2.Assignment2"))
    targetTests.set(listOf("_2.Assignment2Test"))
    mutators.set(listOf("DEFAULTS"))
    outputFormats.set(listOf("HTML"))
    timestampedReports.set(false)
}