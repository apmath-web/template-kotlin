package com.apmath.template

import com.apmath.template.application.v1.v1
import com.apmath.template.domain.posts.PostsService
import com.apmath.template.infrastructure.posts.PostsFetcher
import io.ktor.application.*
import io.ktor.routing.*
import io.ktor.locations.*
import io.ktor.features.*
import io.ktor.gson.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    install(Locations) {
    }

    install(DefaultHeaders) {
    }

    install(ContentNegotiation) {
        gson {
        }
    }

    val postsService = PostsService(PostsFetcher())

    install(Routing) {
        // append routing from application here
        v1(postsService)
    }
}
