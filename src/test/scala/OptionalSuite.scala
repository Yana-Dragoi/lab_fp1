package com.tkroman.kpi.y2022.l1

import munit.FunSuite

class NatSuite extends FunSuite {
  test("multiply") {
    val expected = 21
    val actual = {
    toInt(
      mul(fromInt(3), fromInt(7))
    )
    }
    assertEquals(actual, expected)
  }
  
  test("module") {
    val expected = 3
    val actual = {
    toInt(
      mod(fromInt(5), fromInt(2))
    )
    }
     assertEquals(actual, expected)
  }

  test("toInt") {
    val expected = 4
    val actual = {
    toInt(
    
        Succ(Succ(Succ(Succ(Zero))))
      )
    }
     assertEquals(actual, expected)
  } 
test("fromInt") {
    val expected = Succ(Succ(Succ(Succ(Succ(Zero)))))
    val actual = fromInt(5)
  
     assertEquals(actual, expected)
}

test("min") {
    val expected = 3
    val actual = {
      toInt(
      min(fromInt(3), fromInt(5))
    )
      
    }
     assertEquals(actual, expected)
} 
  
}
