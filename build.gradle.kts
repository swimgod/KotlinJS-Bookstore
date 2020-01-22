buildscript {
    repositories { mavenCentral() }
    dependencies { classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.61") }
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

plugins {
    id("org.jetbrains.kotlin.js").version("1.3.61")
}

repositories {
    mavenCentral()
}

kotlin.target.browser { }
