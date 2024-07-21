package com.example.newsnative.api

import com.example.newsnative.utils.Constants.Companion.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Mohamed Ali Ebaid
 * mo7amedaliebaid@gmail.com
 * 21/07/2024
 */
class RetrofitInstance {

  companion object {

    private val retrofit by lazy {
      val logging = HttpLoggingInterceptor()
      logging.setLevel(HttpLoggingInterceptor.Level.BODY)
      val client = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

      Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
    }
    val api by lazy {
      retrofit.create(NewsApi::class.java)
    }
  }
}
