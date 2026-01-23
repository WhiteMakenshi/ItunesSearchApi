package com.kmpcourse.itunessearchapi.repository

import com.kmpcourse.itunessearchapi.model.ItunesModel
import com.kmpcourse.itunessearchapi.network.ItunesApi

/**
 * Author: solra
 * Date Created: 23/01/2026 
 */
class ItunesRepository(private val itunes: ItunesApi) {
    suspend fun search(search: String): List<ItunesModel> = itunes.search(search)
}