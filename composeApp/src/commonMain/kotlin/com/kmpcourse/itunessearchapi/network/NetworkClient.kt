package com.kmpcourse.itunessearchapi.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

/**
 * Author: solra
 * Date Created: 22/01/2026 
 */
class NetworkClient {
    val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(json = Json { ignoreUnknownKeys = true }, contentType = ContentType.Any)
        }
    }
}