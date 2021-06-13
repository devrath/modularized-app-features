package com.example.inappreview.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

private const val KEY_IN_APP_REVIEW_PREFERENCES = "inAppReviewPreferences"

/**
 * Provides In App Review Android-based dependencies.
 * */
@Module
@InstallIn(SingletonComponent::class)
class InAppReviewProviders {

  /**
   * Provides In App Review Preferences.
   * */
  @Provides
  @Singleton
  fun provideInAppReviewPreferences(@ApplicationContext context: Context): SharedPreferences {
    return context.getSharedPreferences(KEY_IN_APP_REVIEW_PREFERENCES, Context.MODE_PRIVATE)
  }

}