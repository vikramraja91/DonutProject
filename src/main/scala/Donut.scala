class Donut(name:String="",price:Int=0) {
  var a = name
  var b = price


  def discount: Double = {
    val discountedPrice = a match {
      case "plain"    => b * 0.5
      case "chocolate" => b * 1.5
      case _          => b.toDouble
    }

    // Ensure that the discount is non-negative
    if (discountedPrice < 0) {
      0
    } else {
      discountedPrice
    }
  }
  override def toString: String = s"$name which has $price had a discount is $discount)"

}

object Donut{
  def apply(name:String="",price:Int=0):Donut={
    new Donut(name,price)
  }
}
