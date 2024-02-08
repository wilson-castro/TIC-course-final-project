package com.example.restaurantmenu

import com.example.restaurantmenu.enums.Category
import com.example.restaurantmenu.models.Dish
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
  @Test
  fun addition_isCorrect() {
    assertEquals(4, 2 + 2)
  }

  @Test
  fun testDishInitialization() {
    val dish = Dish(
      R.string.sopa_cebola,
      R.string.sopa_cebola_descricao,
      12.0,
      R.drawable.sopa_cebola,
      Category.STARTER,
      8.0
    )
    assertNotNull(dish)
    assertEquals(R.string.sopa_cebola, dish.name)
    assertEquals(R.string.sopa_cebola_descricao, dish.description)
    assertEquals(12.0, dish.preparationTime, 0.01)
    assertEquals(R.drawable.sopa_cebola, dish.image)
    assertEquals(Category.STARTER, dish.category)
    assertEquals(8.0, dish.price, 0.01)
  }

  @Test
  fun testDishPriceFormattedString() {
    val dish = Dish(
      R.string.sopa_cebola,
      R.string.sopa_cebola_descricao,
      12.0,
      R.drawable.sopa_cebola,
      Category.STARTER,
      8.0
    )
    assertEquals("Preço: R$ 8.00", dish.getPriceFormattedString())
  }

  @Test
  fun testDishPrepareTimeString() {
    val dish = Dish(
      R.string.sopa_cebola,
      R.string.sopa_cebola_descricao,
      12.0,
      R.drawable.sopa_cebola,
      Category.STARTER,
      8.0
    )
    assertEquals("Tempo de preparo: 12 minutos", dish.getPrepareTimeString())
  }


  @Test
  fun testDishPrepareTimeStringWithValidTime() {
    val dish = Dish(
      R.string.sopa_cebola,
      R.string.sopa_cebola_descricao,
      12.0,
      R.drawable.sopa_cebola,
      Category.STARTER,
      8.0
    )
    assertEquals("Tempo de preparo: 12 minutos", dish.getPrepareTimeString())
  }

  @Test
  fun testDishPrepareTimeStringWithZeroTime() {
    val dish = Dish(
      R.string.sopa_cebola,
      R.string.sopa_cebola_descricao,
      0.0,
      R.drawable.sopa_cebola,
      Category.STARTER,
      8.0
    )
    assertEquals("Tempo de preparo: Este item não requer tempo de preparo.", dish.getPrepareTimeString())
  }

  @Test
  fun testDishPrepareTimeStringWithNegativeTime() {
    val dish = Dish(
      R.string.sopa_cebola,
      R.string.sopa_cebola_descricao,
      -5.0,
      R.drawable.sopa_cebola,
      Category.STARTER,
      8.0
    )
    assertEquals("Tempo de preparo: Este item não requer tempo de preparo.", dish.getPrepareTimeString())
  }
}