package recursion

object Sqrt {
  def mySqrt(x: Int): Int = {
    val epsilon = 0.0001
    def goodEnough(x: Int, value: Double) = math.abs(value * value - x) < epsilon

    def improve(x:Int, guess: Double): Double = (guess + x / guess) / 2
    def loop(guess: Double): Double =
      if (goodEnough(x, guess)) guess
      else loop(improve(x, guess))

    loop(1.0).toInt
  }
}
