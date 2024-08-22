package com.lordinatec.mines

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "mines-kotlin",
    ) {
        App()
    }
}