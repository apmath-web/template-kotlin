package com.apmath.template.domain.posts

interface PostsServiceInterface {
    suspend fun get(id: Int): PostInterface
}
