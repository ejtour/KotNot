// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:${libs.versions.agp}")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:${libs.versions.kotlin}")
    }
}

plugins {
    alias(libs.plugins.androidApplication) apply false //与com.android.tools.build:gradle 版本保持一直
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false//kotlin-gradle-plugin 版本保持一直
    alias(libs.plugins.androidLibrary) apply false
}