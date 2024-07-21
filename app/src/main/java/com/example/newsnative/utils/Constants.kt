package com.example.newsnative.utils

import com.example.newsnative.secrets.SECRET_API_KEY

/**
 * Mohamed Ali Ebaid
 * mo7amedaliebaid@gmail.com
 * 21/07/2024
 */
class Constants {

  companion object {

    const val API_KEY = SECRET_API_KEY
    const val BASE_URL = "https://newsapi.org/v2/"
    const val SEARCH_NEWS_TIME_DELAY = 500L
    const val QUERY_PAGE_SIZE = 20
  }
}