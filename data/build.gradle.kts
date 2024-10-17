plugins {
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("com.google.devtools.ksp")
}
dependencies {
    implementation(project(":domain"))

    api(libs.retrofit)
    api(libs.moshi)
    api(libs.converter.moshi)
    api(libs.moshi.kotlin)
    ksp(libs.moshi.kotlin.codegen)

    implementation(libs.javax.inject)
}
