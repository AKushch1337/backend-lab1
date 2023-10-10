package com.akushch.plugins

import com.akushch.HealthCheckResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.time.LocalDateTime

fun Application.configureRouting() {
    routing {
        get("/healthcheck") {
            val currentTime = LocalDateTime.now().toString()
            val serverStatus = HttpStatusCode.OK
            val healthCheckResponse = HealthCheckResponse(currentTime, serverStatus)
            call.respond(healthCheckResponse)
        }
    }
}
