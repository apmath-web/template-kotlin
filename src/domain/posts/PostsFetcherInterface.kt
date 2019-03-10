package com.apmath.domain.posts

import com.apmath.infrastructure.posts.Post

interface PostsFetcherInterface {
    suspend fun get(id: Int): Post
}
