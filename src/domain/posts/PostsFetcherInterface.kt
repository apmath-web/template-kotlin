package com.apmath.template.domain.posts

import com.apmath.template.infrastructure.posts.Post

interface PostsFetcherInterface {
    suspend fun get(id: Int): Post
}
