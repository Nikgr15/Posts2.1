package ru.netology

fun main() {

    val original = Post(
        id = 1, ownerId = 1, text = "Нетология", likes = 7, views = 46, repost = null
    )

    val secondPost = Post(
        id = 1, ownerId = 1, text = "Второй пост", likes = 0, views = 14, repost = null
    )

    val updatedPost = Post(
        id = 1, ownerId = 1, text = "Новая Нетология", likes = 10, views = 45, repost = secondPost
    )

    WallService.add(original)
    WallService.add(secondPost)

    WallService.update(updatedPost)
    print(WallService.update(updatedPost))
}
