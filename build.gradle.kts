// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.3.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
    }
}






plugins {
    alias(libs.plugins.androidApplication) apply false //与com.android.tools.build:gradle 版本保持一直
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false//kotlin-gradle-plugin 版本保持一直
    alias(libs.plugins.androidLibrary) apply false
}