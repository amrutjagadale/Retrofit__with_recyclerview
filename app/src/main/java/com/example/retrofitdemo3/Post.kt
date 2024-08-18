package com.example.retrofitdemo3

import java.util.ArrayList

data class PostResponse(
    val posts: List<Post>
)

data class Post(
    val title: String,
    val reactions:Reactions,
    val views: Int
)

data class Reactions(
    val likes: Int,
    val dislikes: Int
)
