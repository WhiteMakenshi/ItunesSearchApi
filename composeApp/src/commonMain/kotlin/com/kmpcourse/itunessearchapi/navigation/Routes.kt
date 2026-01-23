package com.kmpcourse.itunessearchapi.navigation

import kotlinx.serialization.Serializable

/**
 * Author: solra
 * Date Created: 22/01/2026
 */

@Serializable
object Home

@Serializable
data class Results(val search: String)

@Serializable
data class Detail(
    val name: String?,
    val image: String?,
    val kind: String?,
    val desc: String?
)