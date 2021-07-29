package helloScala2

class PascalsTriangleTests extends munit.FunSuite {
  test("legal arguments") {
    assert(Assignment1.Assignment1.pascal(1, 3) == 3);
    assert(Assignment1.Assignment1.pascal(1, 2) == 2);
    assert(Assignment1.Assignment1.pascal(1, 1) == 1);
  }
  test("illegal first argument") {
    interceptMessage[IllegalArgumentException]("Negative Arguments") {
      Assignment1.Assignment1.pascal(-1, 1)
    }
  }
  test("illegal second argument") {
    interceptMessage[IllegalArgumentException]("Negative Arguments") {
      Assignment1.Assignment1.pascal(1, -2)
    }
  }
}

class ParenthesesBalancingTests extends munit.FunSuite {
  test("legal arguments") {
    assert(Assignment1.Assignment1.balance("(just an) example".toList));
    assert(!Assignment1.Assignment1.balance("(just an example".toList));
    assert(!Assignment1.Assignment1.balance(":-)".toList));
    assert(!Assignment1.Assignment1.balance("())(".toList));
    assert(Assignment1.Assignment1.balance("(if (zero? x) max (/ 1 x))".toList));
    assert(Assignment1.Assignment1.balance("I told him (that it's not (yet) done). (But he wasn't listening)".toList));
  }
}

class CountingChangeTests extends munit.FunSuite {
  test("legal arguments") {
    assert(Assignment1.Assignment1.countChange(4, List(1, 2)) == 3);
    assert(Assignment1.Assignment1.countChange(1, List(1)) == 1);
  }

  test("Negative Money Argument") {
    interceptMessage[IllegalArgumentException]("Negative Arguments") {
      Assignment1.Assignment1.countChange(-4, List(1, 2))
    }
  }

  test("Negative Coin Value Argument") {
    interceptMessage[IllegalArgumentException]("Negative Arguments") {
      Assignment1.Assignment1.countChange(4, List(1, -2))
    }
  }
}


