package com.example.moviesappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform