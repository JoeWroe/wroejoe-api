package blog.wroejoe.models

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val id: Int,
    val author: String,
    val content: String
    )
