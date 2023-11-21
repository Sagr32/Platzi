object Libs {


    object Firebase {
        const val firebaseBom = "com.google.firebase:firebase-bom:30.3.1"
        const val firebaseDynamicLinks = "com.google.firebase:firebase-dynamic-links-ktx"
        const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
        const val firebaseMessaging = "com.google.firebase:firebase-messaging-ktx"


    }

    object Paging {
        //        const val pagingCompose = "androidx.paging:paging-compose:${Versions.Paging.pagingCompose}"
        const val pagingCompose = "androidx.paging:paging-compose:1.0.0-alpha20"
        const val pagingRuntime = "androidx.paging:paging-runtime:${Versions.Paging.pagingCompose}"


    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"

    object BuildPlugins {
        const val androidPlugin =
            "com.android.tools.build:gradle:${Versions.androidGradlePluginVersion}"
        const val kotlinPlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    }


    object Android {
        const val constraintLayoutCompose =
            "androidx.constraintlayout:constraintlayout-compose:${Versions.constraintLayoutVersion}"
        const val supportAnnotations =
            "androidx.annotation:annotation:${Versions.androidSupportVersion}"
        const val supportAppcompat =
            "androidx.appcompat:appcompat:${Versions.androidSupportVersion}"
        const val androidMaterial =
            "com.google.android.material:material:${Versions.androidMaterial}"
        const val ktxCore = "androidx.core:core-ktx:${Versions.androidSupportVersion}"
        const val ktxLifecycleRuntime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.ktxCore}"
        const val courotineCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.courotineCore}"
        const val viewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidx_lifecycle_runtime_ktx}"
        const val livedata =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.androidx_lifecycle_runtime_ktx}"
        const val navigation =
            "androidx.navigation:navigation-runtime-ktx:${Versions.navigation}"

    }

    object Accompanist {
        const val permission =
            "com.google.accompanist:accompanist-permissions:${Versions.accompanist}"
        const val adaptivelayout =
            "com.google.accompanist:accompanist-adaptive-layout:${Versions.accompanist}"

    }

    object GoogleMap {
        const val googleMap = "com.google.android.gms:play-services-maps:18.1.0"
        const val googleMapsCompose = "com.google.maps.android:maps-compose:2.14.0"
    }

    object Test {

    }

    object Compose {
        const val composeActivity = "androidx.activity:activity-compose:${Versions.compose}"
        const val composeBom = "androidx.compose:compose-bom:2022.10.00"
        const val ui = "androidx.compose.ui:ui"
        const val uiGraphics = "androidx.compose.ui:ui-graphics"
        const val preview = "androidx.compose.ui:ui-tooling-preview"
        const val material3 = "androidx.compose.material3:material3:${Versions.material_3_version}"
        const val composeNavigation =
            "androidx.navigation:navigation-compose:${Versions.compose_nav_version}"
        const val composeMaterial = "androidx.compose.material:material"

    }

    object diKoin {
        const val koinCompose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
        const val koinAndroid = "io.insert-koin:koin-android:${Versions.koin}"
        const val koinViewModel = "io.insert-koin:koin-androidx-viewmodel:${Versions.koin}"
        const val koinLogger = "io.insert-koin:koin-logger-slf4j:${Versions.koin}"

    }

    object UI {
        const val coilImageLoading = "io.coil-kt:coil-compose:${Versions.coil}"
        const val materialIcons = "androidx.compose.material:material-icons-extended"
        const val systemuicontroller =
            "com.google.accompanist:accompanist-systemuicontroller:${Versions.companistSystemuicontroller}"

    }

    object Networking {
        //Networking libraries
        const val retrofite = "com.squareup.retrofit2:retrofit:${Versions.retrofite}"
        const val retrofiteCoventer =
            "com.squareup.retrofit2:converter-gson:${Versions.retrofite}"
        const val googleGson = "com.google.code.gson:gson:${Versions.retrofite}"
        const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

    }


    object SweetToast {
        const val sweetToast = "com.github.tfaki:ComposableSweetToast:1.0.0"
    }

    object Cashing {
        const val dataStore =
            "androidx.datastore:datastore-preferences:${Versions.datastoreVersion}"
        const val datastoreCore =
            "androidx.datastore:datastore-core:${Versions.datastoreVersion}"
        // Proto Data Store

    }

    object TestLibraries {
        const val jUnit = "junit:junit:${Versions.junitVersion}"
        const val composejUnit4 = "androidx.compose.ui:ui-test-junit4"
        const val androidXJunit = "androidx.test.ext:junit:${Versions.jUnitAndroidX}"
        const val jUnitRunner = "androidx.test:runner:${Versions.junitRunnerVersion}"
        const val espressoCore =
            "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
        const val composeUi = "androidx.compose.ui:ui-tooling"
        const val composeUiManifest = "androidx.compose.ui:ui-test-manifest"
        const val koinTest = "io.insert-koin:koin-test:${Versions.koin}"

        const val koinAndroidTest = "io.insert-koin:koin-android-test:${Versions.koin}"
        const val koinTestJunit = "koin_testJUnit4:3.4.0"

        const val mockito = "org.mockito:mockito-core:${Versions.mockitoVersion}"
        const val mockitoKotlin = "org.mockito.kotlin:mockito-kotlin:${Versions.mockitoVersion}"
        const val mockitoAndroid = "org.mockito:mockito-android:${Versions.mockitoVersion}"
        const val coroutineTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesTestVersion}"
        // Unit Testing
        const val core_ktx = "androidx.test:core-ktx:1.5.0"
        const val junit_ktx = "androidx.test.ext:junit-ktx:1.1.5"
        const val core_testing = "androidx.arch.core:core-testing:2.2.0"
        const val robolectric = "org.robolectric:robolectric:4.8"
        const val hamcrest = "org.hamcrest:hamcrest:2.2"
        const val hamcrest_library = "org.hamcrest:hamcrest-library:2.2"
        const val coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4"
        const val googleTruth = "com.google.truth:truth:${Versions.googleTruthVersion}"
        const val mockWebServer = "com.squareup.okhttp3:mockwebserver:4.9.1"

    }

}

