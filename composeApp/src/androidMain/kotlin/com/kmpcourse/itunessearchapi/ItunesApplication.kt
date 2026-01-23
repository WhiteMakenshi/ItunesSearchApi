package com.kmpcourse.itunessearchapi

import android.app.Application
import com.kmpcourse.itunessearchapi.di.initKoin
import io.ktor.http.ContentType

/**
 * Author: solra
 * Date Created: 23/01/2026 
 */
class ItunesApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin(this)
    }
}