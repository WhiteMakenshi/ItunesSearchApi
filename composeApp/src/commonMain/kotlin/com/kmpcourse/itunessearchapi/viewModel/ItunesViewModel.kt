package com.kmpcourse.itunessearchapi.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kmpcourse.itunessearchapi.model.ApiResponse
import com.kmpcourse.itunessearchapi.model.ItunesModel
import com.kmpcourse.itunessearchapi.network.NetworkClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.encodeURLParameter
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * Author: solra
 * Date Created: 22/01/2026 
 */
class ItunesViewModel: ViewModel() {
    private val _itunesList = MutableStateFlow<List<ItunesModel>>(emptyList())
    val itunesList : StateFlow<List<ItunesModel>> = _itunesList

    fun getSearch(search: String) {
        val encodeSearch = search.encodeURLParameter()
        val url = "https://itunes.apple.com/search?term=$encodeSearch"
        viewModelScope.launch {
            val client = NetworkClient().httpClient
            val response = client.get(url).body<ApiResponse>()
            _itunesList.value = response.results
        }
    }

}