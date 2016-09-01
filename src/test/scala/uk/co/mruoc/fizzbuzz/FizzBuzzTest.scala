package uk.co.mruoc.fizzbuzz

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzTest extends FlatSpec with Matchers {

  "FizzBuzz" should "return number" in {
    FizzBuzz.getResult(1) should be ("1")
    FizzBuzz.getResult(2) should be ("2")
    FizzBuzz.getResult(4) should be ("4")
  }

  "FizzBuzz" should "return fizz if number is divisible by 3" in {
    FizzBuzz.getResult(3) should be ("Fizz")
    FizzBuzz.getResult(6) should be ("Fizz")
  }

}
