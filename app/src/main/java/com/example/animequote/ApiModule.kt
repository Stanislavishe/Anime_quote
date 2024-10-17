package com.example.animequote

import com.example.data.AnimeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    fun provideApi() =
        Retrofit.Builder().baseUrl("https://animechan.xyz/")
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(AnimeApi::class.java)
}