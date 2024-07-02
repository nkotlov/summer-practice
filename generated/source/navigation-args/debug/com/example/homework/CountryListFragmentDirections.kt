package com.example.homework

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int

public class CountryListFragmentDirections private constructor() {
  private data class ActionCountryListFragmentToCountryDetailFragment(
    public val countryId: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_countryListFragment_to_countryDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("countryId", this.countryId)
        return result
      }
  }

  public companion object {
    public fun actionCountryListFragmentToCountryDetailFragment(countryId: Int): NavDirections =
        ActionCountryListFragmentToCountryDetailFragment(countryId)
  }
}
