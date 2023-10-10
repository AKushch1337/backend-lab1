package com.akushch.plugins

import com.akushch.TimeResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.time.LocalDateTime

fun Application.configureRouting() {
    routing {
        get("/healthcheck") {
            val currentTimeResponse = TimeResponse(LocalDateTime.now().toString())
            call.respond(currentTimeResponse)
        }
    }
}
