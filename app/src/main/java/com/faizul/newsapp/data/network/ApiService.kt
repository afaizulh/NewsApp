package com.faizul.newsapp.data.network

import com.faizul.newsapp.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/v2/everything")
    fun getPoliticNews(
        @Query("q")  q:String = "top",
        @Query("language") language: String = "en",
        @Query("sortBy") sortBy: String = "popularity"
    ): Call<NewsResponse>

    @GET("/v2/everything")
    fun getMusicNews(
        @Query("q") q: String = "music",
        @Query("language") language: String = "en",
        @Query("sortBy") sortBy: String = "popularity"
    ): Call<NewsResponse>


    @GET("/v2/everything")
    fun getTechnologyNews(
        @Query("q") q: String = "technology",
        @Query("language") language: String = "en",
        @Query("sortBy") sortBy: String = "popularity"
    ): Call<NewsResponse>


    @GET("/v2/everything")
    fun getEducationNews(
        @Query("q") q: String = "education",
        @Query("language") language: String = "en",
    ): Call<NewsResponse>


    @GET("/v2/everything")
    fun getSearchNews(
        @Query("q") q: String,
        @Query("pageSize") pageSize: Int = 19,
    ): Call<NewsResponse>
}
