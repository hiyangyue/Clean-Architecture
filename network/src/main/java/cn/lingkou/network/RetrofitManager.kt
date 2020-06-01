package cn.lingkou.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitManager {

    // todo replace API_BASE_URL
    private const val API_BASE_URL: String = "https://api.github.com/"
    private val httpClient = OkHttpClient.Builder()
    private val builder: Retrofit.Builder = Retrofit.Builder()
        .baseUrl(API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())

    private fun getRetrofit(): Retrofit {
        return builder.client(httpClient.build())
            .build()
    }

    fun <T> provideService(service: Class<T>): T {
        return getRetrofit().create(service)
    }
}