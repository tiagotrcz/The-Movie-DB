package dev.trcz.domain.themoviedb.usecases

import dev.trcz.domain.themoviedb.NoParams
import dev.trcz.domain.themoviedb.SuspendedUseCase
import dev.trcz.domain.themoviedb.models.Movie
import dev.trcz.domain.themoviedb.repositories.MovieRepository

class GetMoviesUseCase(
    private val movieRepository: MovieRepository,
) : SuspendedUseCase<NoParams, List<Movie>> {

    override suspend fun invoke(params: NoParams): List<Movie> = movieRepository.getPopularMovies()
}