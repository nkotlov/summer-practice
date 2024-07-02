package com.example.homework

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class CountryDetailFragmentArgs(
  public val countryId: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("countryId", this.countryId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("countryId", this.countryId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CountryDetailFragmentArgs {
      bundle.setClassLoader(CountryDetailFragmentArgs::class.java.classLoader)
      val __countryId : Int
      if (bundle.containsKey("countryId")) {
        __countryId = bundle.getInt("countryId")
      } else {
        throw IllegalArgumentException("Required argument \"countryId\" is missing and does not have an android:defaultValue")
      }
      return CountryDetailFragmentArgs(__countryId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CountryDetailFragmentArgs {
      val __countryId : Int?
      if (savedStateHandle.contains("countryId")) {
        __countryId = savedStateHandle["countryId"]
        if (__countryId == null) {
          throw IllegalArgumentException("Argument \"countryId\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"countryId\" is missing and does not have an android:defaultValue")
      }
      return CountryDetailFragmentArgs(__countryId)
    }
  }
}
