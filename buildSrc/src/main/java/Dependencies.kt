object Version {

    // base
    const val core_ktx = "1.2.0"
    const val kotlin = "1.3.71"
    const val gradle = "3.6.3"

    // test
    const val junit = "4.12"
    const val androidx_junit = "1.1.1"
    const val espresso_core = "3.2.0"

    // view
    const val glide = "4.11.0"
    const val glideCompiler = "4.11.0"
    const val constraintlayout = "1.1.3"
    const val appcompat = "1.1.0"

    // network
    const val retrofitVersion = "2.5.0"
    const val okhttpVersion = "4.3.1"
    const val converter_gson = "2.5.0"

    // router
    const val arouter_api = "1.4.0"
    const val arouter_compiler = "1.2.2"

    // monitor
    const val leakCanary = "2.3"
    const val blockCanary = "1.5.0"

    // db
    const val room = "2.1.0"
}

object Libs {
    const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Version.glideCompiler}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Version.constraintlayout}"
    const val junit = "junit:junit:${Version.junit}"
    const val androidx_junit = "androidx.test.ext:junit:${Version.androidx_junit}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Version.espresso_core}"
    const val appcompact = "androidx.appcompat:appcompat:${Version.appcompat}"
    const val core_ktx = "androidx.core:core-ktx:${Version.core_ktx}"

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofitVersion}"
    const val okhttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Version.okhttpVersion}"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:${Version.converter_gson}"

    // router
    const val arouter_api = "com.alibaba:arouter-api:${Version.arouter_api}"
    const val arouter_compiler = "com.alibaba:arouter-compiler:${Version.arouter_compiler}"

    // monitor
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Version.leakCanary}"
    const val blockCanary = "com.github.markzhai:blockcanary-android:${Version.blockCanary}"

    // db
    const val room = "androidx.room:room-runtime:${Version.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Version.room}"
}

object DefaultConfig {
    const val minSdkVersion = 21
    const val targetSdkVersion = 21
    const val versionCode = 1
    const val versionName = "1.0"
}

object AndroidConfiguration {
    const val compileSdkVersion = 29
    const val buildToolsVersion = "29.0.3"
}

object ApplicationConfiguration {
    const val applicationId = "cn.lingkou.app"
}

object Modules {
    const val network = ":common:network"
    const val view = ":common:view"

    const val feature_mine = ":feature:mine"
    const val feature_notification = ":feature:notification"
    const val foundation = ":common:foundation"
    const val debug = ":common:debug"
    const val core_business = ":common:corebusiness"
}