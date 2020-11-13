import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import ru.netology.Post
import ru.netology.WallService

class WallServiceTest {

    @Test
    fun updateFalse() {

        WallService.add(Post(id = 1,
            ownerId = 1,
            text = "Нетология",
            likes = 7,
            views = 46,
            repost = null))
        val update = Post(id = 3,
            ownerId = 5,
            text = "Нетология",
            likes = 9,
            views = 4,
            repost = null)
        val result = WallService.update(update)

        assertFalse(result)


    }

    @Test
    fun updateTrue() {

        WallService.add(Post(id = 1,
            ownerId = 1,
            text = "Второй пост",
            likes = 0,
            views = 14,
            repost = null))
        val update = Post(id = 1,
            ownerId = 1,
            text = "Второй пост",
            likes = 0,
            views = 14,
            repost = null)
        val result = WallService.update(update)

        assertTrue(result)
    }

    @Test
    fun add() {
        val service = WallService.add(Post(id = 1,
            ownerId = 1,
            text = "Нетология",
            likes = 7,
            views = 46,
            repost = null))

        assertTrue(service.id != 0)
    }
}

