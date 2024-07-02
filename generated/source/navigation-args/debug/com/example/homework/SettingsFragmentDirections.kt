package com.example.homework

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class SettingsFragmentDirections private constructor() {
  private data class ActionSettingsFragmentToDisplayFragment(
    public val inputText: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_settingsFragment_to_displayFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("inputText", this.inputText)
        return result
      }
  }

  public companion object {
    public fun actionSettingsFragmentToDisplayFragment(inputText: String): NavDirections =
        ActionSettingsFragmentToDisplayFragment(inputText)
  }
}
