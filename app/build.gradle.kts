plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "kz.zhasik.wechat"
    compileSdk = 34

    defaultConfig {
        applicationId = "kz.zhasik.wechat"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        buildConfigField("String", "API_KEY", "\"nsDLB8jLjTyXCDSgw8fFQubpxom4rSmY\"")
        buildConfigField("String", "EMAIL", "\"zhasikdeveloper@gmail.com\"")
        buildConfigField("String", "AVATAR", "\"https://avatars.zulip.com/54137/e737f684806237e9eb4d8d0d33c9e9c7124bcea6-medium.png\"")
        buildConfigField("String", "FULL_NAME", "\"Zhandos Baimurat\"")
        buildConfigField("String", "USER_ID", "\"604581\"")
        buildConfigField("String", "BASE_URL", "\"https://tinkoff-android-spring-2023.zulipchat.com\"")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(libs.retrofit)
    implementation(libs.gson)
    implementation(libs.converter.gson)

}