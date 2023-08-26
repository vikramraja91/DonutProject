class Donut(name: String = "", price: Int = 0) {
  var a = name
  var b = price

  def discount: Double = {
    try {
      if (b < 0) {
        throw new IllegalArgumentException("Price cannot be negative")
      }
      a match {
        case "plain" => b * 0.5
        case "chocolate" => b * 1.5
        case _ => b.toDouble
      }
    } catch {
      case e: NumberFormatException =>
        println(s"Invalid price of $a: $b")
        0
      case _: IllegalArgumentException =>
        println("Price cannot be negative")
        0
      case _: Throwable =>
        println("An unexpected error occurred")
        0
    }
  }

  override def toString: String = s"$name which has $price had a discount is $discount"
}

object Donut {
  def apply(name: String = "", price: Int = 0): Donut = {
    new Donut(name, price)
  }
}


