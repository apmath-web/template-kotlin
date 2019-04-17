package com.apmath.template.application.v1.actions

import com.apmath.template.application.v1.models.Post
import com.apmath.template.domain.services.PostsServiceInterface
import io.ktor.application.ApplicationCall
import io.ktor.response.respond
import io.ktor.routing.Route
import org.koin.ktor.ext.inject

suspend fun ApplicationCall.v1Post(route: Route) {
    val service: PostsServiceInterface by route.inject()

    val post = service.get(1)
    respond(Post("#${post.id}", post.title))
}
