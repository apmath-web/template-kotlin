package com.apmath.application.v1.actions

import com.apmath.application.v1.models.Post
import com.apmath.domain.posts.PostsServiceInterface
import io.ktor.application.ApplicationCall
import io.ktor.response.respond

suspend fun ApplicationCall.v1Post(postsService: PostsServiceInterface) {

    val post = postsService.get(1)
    respond(Post("#${post.id}", post.title))
}
