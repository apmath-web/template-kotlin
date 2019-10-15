package com.apmath.template.infrastructure

import com.apmath.template.domain.fetchers.PostsFetcherInterface
import com.apmath.template.domain.services.PostsService
import com.apmath.template.domain.services.PostsServiceInterface
import com.apmath.template.infrastructure.fetchers.PostsFetcher
import org.koin.dsl.module
import org.koin.experimental.builder.singleBy

val template = module {
    singleBy<PostsServiceInterface, PostsService>()
    singleBy<PostsFetcherInterface, PostsFetcher>()
}
