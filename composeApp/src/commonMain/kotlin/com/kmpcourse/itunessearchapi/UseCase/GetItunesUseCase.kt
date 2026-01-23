package com.kmpcourse.itunessearchapi.UseCase

import com.kmpcourse.itunessearchapi.model.ItunesModel
import com.kmpcourse.itunessearchapi.repository.ItunesRepository

/**
 * Author: solra
 * Date Created: 23/01/2026 
 */
class GetItunesUseCase(private val repository: ItunesRepository) {
    suspend operator fun invoke(search: String) : List<ItunesModel> =
        repository.search(search)

}