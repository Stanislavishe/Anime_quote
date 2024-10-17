package com.example.animequote

import com.example.data.AnimeRepoImpl
import com.example.domain.AnimeRepository
import com.example.domain.LoadQuoteResult
import com.example.presentation.QuoteUIMapper
import com.example.presentation.QuoteUIState
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {

    @Binds
    abstract fun provideAnimeRepository(animeRepoImpl: AnimeRepoImpl): AnimeRepository

    @Binds
    abstract fun provideMapper(mapper: QuoteUIMapper) : LoadQuoteResult.Mapper<QuoteUIState>
}