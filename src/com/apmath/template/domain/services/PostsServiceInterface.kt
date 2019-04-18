package com.apmath.template.domain.services

import com.apmath.template.domain.posts.PostInterface

interface PostsServiceInterface {
    suspend fun get(id: Int): PostInterface
}
