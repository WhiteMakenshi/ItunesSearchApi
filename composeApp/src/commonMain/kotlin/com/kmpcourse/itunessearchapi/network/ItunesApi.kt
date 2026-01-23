package com.kmpcourse.itunessearchapi.network

import com.kmpcourse.itunessearchapi.model.ApiResponse
import com.kmpcourse.itunessearchapi.model.ItunesModel
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.encodeURLParameter

/**
 * Author: solra
 * Date Created: 23/01/2026 
 */
class ItunesApi(private val client: HttpClient) {
    suspend fun search(term: String): List<ItunesModel> {
        val search = term.encodeURLParameter()
        val url = "https://itunes.apple.com/search?term=$search"
        val response = client.get(url).body<ApiResponse>()
        return response.results
    }
}