package com.apmath.template.domain.fetchers

import com.apmath.template.infrastructure.posts.Post

interface PostsFetcherInterface {
    suspend fun get(id: Int): Post
}
