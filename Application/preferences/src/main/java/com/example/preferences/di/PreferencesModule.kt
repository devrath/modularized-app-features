package com.example.preferences.di

import android.content.Context
import com.example.preferences.PrefUtils
import com.example.preferences.GeneralSettingsPrefs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class PreferencesModule {

  @Provides
  @Singleton
  fun providePrefsUtils(@ApplicationContext context: Context) = PrefUtils(context)

  @Provides
  @Singleton
  fun provideSettingsPrefs(prefUtils: PrefUtils) = GeneralSettingsPrefs(prefUtils)
}