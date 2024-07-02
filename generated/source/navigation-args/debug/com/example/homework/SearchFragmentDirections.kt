package com.example.homework

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int

public class SearchFragmentDirections private constructor() {
  private data class ActionSearchFragmentToCountryDetailFragment(
    public val countryId: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_searchFragment_to_countryDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("countryId", this.countryId)
        return result
      }
  }

  public companion object {
    public fun actionSearchFragmentToCountryDetailFragment(countryId: Int): NavDirections =
        ActionSearchFragmentToCountryDetailFragment(countryId)
  }
}
