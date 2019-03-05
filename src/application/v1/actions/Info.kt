package com.apmath.application.v1.actions

import com.apmath.application.v1.models.Info
import io.ktor.application.ApplicationCall
import io.ktor.response.respond

suspend fun ApplicationCall.info() {
    respond(Info("0.0.1"))
}
