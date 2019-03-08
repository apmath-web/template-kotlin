package com.apmath.infrastructure.posts

import com.apmath.domain.posts.PostsFetcherInterface
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.request.get

class PostsFetcher: PostsFetcherInterface {
    // TODO: move client into another service
    val client: HttpClient = HttpClient(Apache) {
        install(JsonFeature) {
            serializer = GsonSerializer {
                // .GsonBuilder
                //serializeNulls()
                //disableHtmlEscaping()
            }
        }
    }

    override suspend fun get(id: Int): Post {
        val post = client.get<Post>(
            scheme = SCHEME,
            host = HOST,
            path = "/posts/$id"
        )

        // possible validation here

        return post
    }

    companion object {
        const val SCHEME = "https"
        const val HOST = "jsonplaceholder.typicode.com"
    }
}