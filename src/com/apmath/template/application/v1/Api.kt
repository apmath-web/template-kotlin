package com.apmath.template.application.v1

import com.apmath.template.application.v1.actions.v1Info
import com.apmath.template.application.v1.actions.v1Post
import com.apmath.template.domain.services.PostsServiceInterface
import io.ktor.application.call
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.route
import org.koin.ktor.ext.inject

internal fun Routing.v1() {

    v1Info()
    v1Post()
    // other route groups here
}

private fun Routing.v1Info() {

    route("v1") {
        get("info") {
            call.v1Info()
        }
    }
}

private fun Routing.v1Post() {
    val postsService: PostsServiceInterface by inject()

    route("v1") {
        get("post") {
            call.v1Post(postsService)
        }
    }
}
