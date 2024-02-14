package com.tailspin.touristtracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform