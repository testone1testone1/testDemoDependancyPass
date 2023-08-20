import org.scalatest.flatspec.AnyFlatSpec

class ExampleTest extends AnyFlatSpec {
  "Method returnRandomUUIDString" should "always return different value" in {
    assert(Example.returnRandomUUIDString() != Example.returnRandomUUIDString())
  }
}
