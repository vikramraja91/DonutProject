import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper


class DonutTest extends AnyFlatSpec with Matchers{
  behavior of "A Donut"
  it should "have discount choclate of" in {
    val a=Donut("choclate",30)
    assert(a.discount===30)
  }
  it should "have discount plain of" in {
    val b=Donut("plain",10)
    assert(b.discount===5)
  }
  it should "have discount other of" in {
    val c=Donut("straw",20)
    assert(c.discount===20)
  }
  it should "handle negative price correctly" in {
    val d = Donut("negative", -5)
    d.discount shouldEqual 0 // Ensure that the discount for negative price is 0
  }

}
