package com.neoapp.fitlife

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform