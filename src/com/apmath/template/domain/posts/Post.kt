package com.apmath.template.domain.posts

class Post(id: Int, title: String): PostInterface {
    override var id: Int = id
    override var title: String = title
}
