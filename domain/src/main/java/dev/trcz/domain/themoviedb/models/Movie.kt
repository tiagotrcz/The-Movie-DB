package dev.trcz.domain.themoviedb.models

data class Movie(
    val id: Long,
    val title: String,
    val posterPath: String,
    val genres: List<String>,
    val rating: Double,
)
