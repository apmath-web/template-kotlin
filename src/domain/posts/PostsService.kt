package com.apmath.template.domain.posts

class PostsService(postFetcher: PostsFetcherInterface): PostsServiceInterface {
    private val postFetcher: PostsFetcherInterface = postFetcher

    override suspend fun get(id: Int): PostInterface {
        val post = postFetcher.get(id)

        return Post(post.id, post.title)
    }
}