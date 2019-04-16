package com.apmath.template.application.v1.actions

import com.apmath.template.application.v1.models.Post
import com.apmath.template.infrastructure.ServiceManager
import io.ktor.application.ApplicationCall
import io.ktor.response.respond

suspend fun ApplicationCall.v1Post() {

    val post = ServiceManager.getInstance()
        .postsService.get(1)
    respond(Post("#${post.id}", post.title))
}
