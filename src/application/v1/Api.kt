package com.apmath.application.v1

import com.apmath.application.v1.actions.info
import io.ktor.application.call
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.route

internal fun Routing.v1() {
    info()
    // other route groups here
}

private fun Routing.info() {
    route("v1") {
        get("info") {
            call.info()
        }
    }
}
