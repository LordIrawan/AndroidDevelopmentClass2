package com.example.project2

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project2.model.Article
import com.example.project2.network.Api
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    init {
        getListNews()
    }
    fun getListNews(){
        viewModelScope.launch {
            val response = Api.newsAPIService.getTopHeadline()
            val articles = response.articles

            articles.forEach { article: Article ->
                Log.d("response", article.toString())
            }
        }
    }
}