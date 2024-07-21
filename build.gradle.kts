// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript{
  repositories {
    google()
  }
  dependencies{
    classpath(libs.androidx.navigation.safe.args.gradle.plugin)
    classpath(libs.retrofit2)
    classpath(libs.converter.gson)
    classpath(libs.logging.interceptor)
  }
}
plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.jetbrains.kotlin.android) apply false
  alias(libs.plugins.google.ksp) apply true
}

