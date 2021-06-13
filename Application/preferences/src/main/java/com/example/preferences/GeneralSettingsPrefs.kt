package com.example.preferences

import androidx.appcompat.app.AppCompatDelegate

/**
 * Prefs helper for user settings
 *
 * Data related to user settings preferences should be stored and accessed using [GeneralSettingsPrefs]
 */
class GeneralSettingsPrefs(private val prefs: PrefUtils) {

  companion object {
    private const val RECENT_SEARCHES = "recent_searches"
    private const val ALLOW_CRASH_REPORTS = "allow_crash_reports"
    private const val SELECTED_NIGHT_MODE = "selected_night_mode"
    private const val PLAYER_AUTO_PLAY_NEXT = "player_auto_play_next"
    private const val PLAYER_PLAYBACK_SPEED = "player_playback_speed"
    private const val PLAYER_PLAYBACK_QUALITY = "player_playback_quality"
    private const val PLAYER_SUBTITLES_LANGUAGE = "player_subtitles_language"
    private const val DOWNLOAD_WIFI_ONLY = "download_wifi_only"
    private const val DOWNLOAD_QUALITY = "download_quality"
    private const val ALLOW_TIPS = "allow_tips"
    private const val ONBOARDED_VIEWS = "onboarded_views"
  }

  init {
    prefs.init("settings")
  }

  /**
   * Get user stored night mode from preferences
   *
   * @return current night mode
   */
  fun getNightMode(): Int =
    prefs.get(SELECTED_NIGHT_MODE, AppCompatDelegate.MODE_NIGHT_YES)

  /**
   * Save auto play preference
   *
   * @param allowed true if user has allowed auto play else false
   */
  fun saveAutoPlayAllowed(allowed: Boolean) {
    prefs.set(PLAYER_AUTO_PLAY_NEXT, allowed).commit()
  }

}
