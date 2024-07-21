package com.example.newsnative.api

import com.example.newsnative.models.NewsResponse
import com.example.newsnative.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Mohamed Ali Ebaid
 * mo7amedaliebaid@gmail.com
 * 21/07/2024
 */
interface NewsApi {

  @GET("top-headlines")
  suspend fun getHeadlines(
    @Query("country")
    countryCode: String = "us",
    @Query("page")
    page: Int = 1,
    @Query("apiKey")
    apiKey: String = API_KEY
  ): Response<NewsResponse>

  @GET("everything")
  suspend fun searchNews(
    @Query("q")
    searchQuery: String,
    @Query("page")
    page: Int = 1,
    @Query("apiKey")
    apiKey: String = API_KEY
  ): Response<NewsResponse>
}