package com.lordinatec.mines

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform