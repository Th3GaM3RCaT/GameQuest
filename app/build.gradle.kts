plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.thecurseds.gamequest"
    compileSdk = 33


    defaultConfig {
        applicationId = "com.thecurseds.gamequest"
        minSdk = 28
        targetSdk = 33
        versionCode = 2
        versionName = "1.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    packaging {
        resources {
            excludes += "/META-INF/io.netty.versions.properties"
            excludes += "/META-INF/INDEX.LIST"
        }
    }
}

dependencies {
    implementation("androidx.compose.ui:ui-android:1.5.4")
    implementation("androidx.compose.ui:ui-tooling-preview-android:1.5.4")
    val activityVersion = "1.6.1"//"1.8.0-alpha01"//"1.7.0-beta01"//

    constraints {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.8.0") {
            because("kotlin-stdlib-jdk7 is now a part of kotlin-stdlib")
        }
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.0") {
            because("kotlin-stdlib-jdk8 is now a part of kotlin-stdlib")
        }
    }

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth-ktx:22.1.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.android.gms:play-services-auth:20.7.0")
    implementation("com.google.firebase:firebase-auth-ktx:22.1.2")
    implementation("androidx.activity:activity-ktx:$activityVersion")
    implementation("com.google.firebase:firebase-firestore")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    implementation ("com.firebaseui:firebase-ui-storage:7.2.0")
    implementation ("com.hivemq:hivemq-mqtt-client:1.3.0")

}