plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "kz.concurrent.reactionx"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
}