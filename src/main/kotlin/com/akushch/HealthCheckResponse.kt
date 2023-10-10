package com.akushch

import io.ktor.http.*

data class HealthCheckResponse(val currentTime: String, val serverStatus: HttpStatusCode)