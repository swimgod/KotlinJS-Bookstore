buildscript {
    repositories { mavenCentral() }
    dependencies { classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61") }
}

plugins {
    id("org.jetbrains.kotlin.js").version("1.3.61")
}

apply {
    from("gradle/dependencies.gradle.kts")
}

repositories {
    mavenCentral()
}

kotlin.target.browser { }
