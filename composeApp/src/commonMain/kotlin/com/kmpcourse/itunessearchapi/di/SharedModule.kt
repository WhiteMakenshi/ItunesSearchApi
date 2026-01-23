package com.kmpcourse.itunessearchapi.di

import com.kmpcourse.itunessearchapi.UseCase.GetItunesUseCase
import com.kmpcourse.itunessearchapi.network.ItunesApi
import com.kmpcourse.itunessearchapi.network.NetworkClient
import com.kmpcourse.itunessearchapi.repository.ItunesRepository
import com.kmpcourse.itunessearchapi.viewModel.MainViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Author: solra
 * Date Created: 23/01/2026
 */
val sharedModule = module {
    single { NetworkClient().httpClient }
    single { ItunesApi(get()) }
    singleOf(::ItunesRepository)
    singleOf(::GetItunesUseCase)
    viewModelOf(::MainViewModel)
}