package com.example.christcentered

import java.time.LocalDate

data class Quote(
    val text: String,
    val reference: String
)

object QuoteRepository {
    val quotes = listOf(
        Quote(
            "For God so loved the world, that he gave his only begotten Son, that whosoever believeth in him should not perish, but have everlasting life.",
            "John 3:16"
        ),
        Quote(
            "I am the way, the truth, and the life: no man commeth unto the Father, but by me.",
            "John 14:6"
        ),
        Quote(
            "But seek ye first the kingdom of God, and his righteousness; and all these things shall be added unto you.",
            "Matthew 6:33"
        ),
        Quote(
            "Come unto me, all ye that labour and are heavy laden, and I will give you rest.",
            "Matthew 11:28"
        ),
        Quote(
            "And Jesus said unto them, I am the bread of life: he that cometh to me shall never hunger; and he that believeth on me shall never thirst.",
            "John 6:35"
        ),
        Quote(
            "Peace I leave with you, my peace I give unto you: not as the world giveth, give I unto you. Let not your heart be troubled, neither let it be afraid.",
            "John 14:27"
        ),
        Quote(
            "I am the light of the world: he that followeth me shall not walk in darkness, but shall have the light of life.",
            "John 8:12"
        ),
        Quote(
            "These things I have spoken unto you, that in me ye might have peace. In the world ye shall have tribulation: but be of good cheer; I have overcome the world.",
            "John 16:33"
        ),
        Quote(
            "A new commandment I give unto you, That ye love one another; as I have loved you, that ye also love one another.",
            "John 13:34"
        ),
        Quote(
            "For the Son of man is come to seek and to save that which was lost.",
            "Luke 19:10"
        ),
        Quote(
            "Go ye therefore, and teach all nations, baptizing them in the name of the Father, and of the Son, and of the Holy Ghost.",
            "Matthew 28:19"
        ),
        Quote(
            "Ask, and it shall be given you; seek, and ye shall find; knock, and it shall be opened unto you.",
            "Matthew 7:7"
        ),
        Quote(
            "Blessed are the peacemakers: for they shall be called the children of God.",
            "Matthew 5:9"
        ),
        Quote(
            "Let your light so shine before men, that they may see your good works, and glorify your Father which is in heaven.",
            "Matthew 5:16"
        ),
        Quote(
            "The Lord is my shepherd; I shall not want.",
            "Psalm 23:1"
        ),
        Quote(
            "I can do all things through Christ which strengtheneth me.",
            "Philippians 4:13"
        ),
        Quote(
            "And we know that all things work together for good to them that love God, to them who are the called according to his purpose.",
            "Romans 8:28"
        ),
        Quote(
            "Trust in the Lord with all thine heart; and lean not unto thine own understanding.",
            "Proverbs 3:5"
        ),
        Quote(
            "This is my work and my glory—to bring to pass the immortality and eternal life of man.",
            "Moses 1:39"
        ),
        Quote(
            "And it came to pass that I, Nephi, said unto my father: I will go and do the things which the Lord hath commanded, for I know that the " +
                    "lord giveth no commandments unto the children of men, save he shall prepare a way for them that they may accomplish the thing which he commandeth them.",
            "1 Nephi 3:7"
        ),
        Quote(
            "Adam fell that men might be; and men are, that they might have joy",
            "2 Nephi 2:25"
        )
    )

    fun getDailyQuote(): Quote {
        val day = LocalDate.now().toEpochDay()
        val index = (day % quotes.size).toInt()
        return quotes[index]
    }
}

