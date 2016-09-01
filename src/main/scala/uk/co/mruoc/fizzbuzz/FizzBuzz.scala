package uk.co.mruoc.fizzbuzz

object FizzBuzz {

  def getResult(number: Int): String = (number % 3) match {
    case (0) =>"Fizz"
    case _ => number.toString()
  }

}
