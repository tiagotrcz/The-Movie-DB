package dev.trcz.domain.themoviedb.repositories

import dev.trcz.domain.themoviedb.models.Movie

interface MovieRepository {

    suspend fun getPopularMovies(): List<Movie>

    suspend fun getMovieGenre(id: Long): String

}