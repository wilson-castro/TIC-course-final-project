package com.example.restaurantmenu.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.restaurantmenu.enums.Category

data class Dish(
  @StringRes val name: Int,
  @StringRes val description: Int,
  val price: Double,
  @DrawableRes val image: Int,
  val category: Category,
  val preparationTime: Double
) {

  fun getPriceFormattedString(): String {
    return String.format("Preço: R$ %.2f", price)
  }

  fun getPrepareTimeString(): String {
    return if (preparationTime > 0.0) {
      "Tempo de preparo: ${preparationTime.toInt()} minutos"
    } else {
      "Tempo de preparo: Este item não requer tempo de preparo."
    }
  }

}