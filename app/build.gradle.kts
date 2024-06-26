plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.real"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.real"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.test.espresso:espresso-intents:3.5.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.airbnb.android:lottie:6.1.0")



    testImplementation ("org.robolectric:robolectric:4.6.1")

    testImplementation ("org.mockito:mockito-core:4.0.0")
    testImplementation ("androidx.test:core:1.4.0")
    testImplementation ("org.robolectric:shadows-framework:4.6.1")

    androidTestImplementation ("androidx.test.espresso:espresso-contrib:3.3.0")
    androidTestImplementation ("androidx.test:rules:1.3.0")
}