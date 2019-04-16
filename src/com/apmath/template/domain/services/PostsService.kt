package com.apmath.template.domain.services

import com.apmath.template.domain.fetchers.PostsFetcherInterface
import com.apmath.template.domain.posts.Post
import com.apmath.template.domain.posts.PostInterface

class PostsService(postFetcher: PostsFetcherInterface): PostsServiceInterface {
    private val postFetcher: PostsFetcherInterface = postFetcher

    override suspend fun get(id: Int): PostInterface {
        val post = postFetcher.get(id)

        return Post(post.id, post.title)
    }
}
