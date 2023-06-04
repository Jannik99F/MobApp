package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import com.example.routes.*

fun Application.configureRouting() {
    routing {
        customerRouting()
    }
}
