package dev.trcz.domain.themoviedb

interface SuspendedUseCase<Params, Result> {
    suspend operator fun invoke(params: Params): Result
}

object NoParams