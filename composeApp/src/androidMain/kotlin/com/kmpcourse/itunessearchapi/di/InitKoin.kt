package com.kmpcourse.itunessearchapi.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Author: solra
 * Date Created: 23/01/2026
 */
fun initKoin(application: Application) = startKoin {
    androidContext(application)
    modules(
        sharedModule
    )
}