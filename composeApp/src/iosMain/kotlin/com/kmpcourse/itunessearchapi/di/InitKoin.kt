package com.kmpcourse.itunessearchapi.di

import org.koin.core.context.startKoin

/**
 * Author: solra
 * Date Created: 23/01/2026
 */
fun initKoin(){
    startKoin {
        modules(sharedModule)
    }
}