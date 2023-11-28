package com.faizul.newsapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.faizul.newsapp.data.model.NewsResponse
import com.faizul.newsapp.data.repository.NewsRepository

class NewsViewModel(private val repository: NewsRepository) : ViewModel() {
    val politicNews: LiveData<NewsResponse> = repository.politicNews
    val musicNews: LiveData<NewsResponse> = repository.musicNews
    val technologyNews: LiveData<NewsResponse> = repository.technologyNews
    val educationNews: LiveData<NewsResponse> = repository.educationNews
    val searchNews: LiveData<NewsResponse> = repository.searchNews
    val isLoading: LiveData<Boolean> = repository.isLoading

    fun getPoliticNews() {
        repository.getPoliticNews()
    }

    fun getMusicNews() {
        repository.getMusicNews()
    }

    fun getTechnologyNews() {
        repository.getTechnologyNews()
    }

    fun getEducationNews() {
        repository.getEducationNews()
    }

    fun getSearchNews(q: String) {
        repository.getSearchNews(q)
    }
}