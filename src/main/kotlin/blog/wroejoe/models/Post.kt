package blog.wroejoe.models

import kotlinx.serialization.Serializable

val postStorage = mutableListOf<Post>()

@Serializable
data class Post(
    val id: Int,
    val author: String,
    val content: String
    )
