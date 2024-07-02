package com.example.homework

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class InputFragmentDirections private constructor() {
  private data class ActionInputFragmentToDisplayFragment(
    public val inputText: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_inputFragment_to_displayFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("inputText", this.inputText)
        return result
      }
  }

  public companion object {
    public fun actionInputFragmentToDisplayFragment(inputText: String): NavDirections =
        ActionInputFragmentToDisplayFragment(inputText)
  }
}
