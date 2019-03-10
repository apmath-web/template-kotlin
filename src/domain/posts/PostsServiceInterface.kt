package com.apmath.domain.posts

interface PostsServiceInterface {
    suspend fun get(id: Int): PostInterface
}
