package com.berov.algos.basic

import mocks.Mocky
import spock.lang.Specification

class FibonacciShould extends Specification {

  private Fibonacci fibonacci
  private def mock

  void setup() {
      //mock = Spy(Mocky)
      fibonacci = new Fibonacci()
  }

  def 'Expect from Fibonacci'() {
    expect:
      fibonacci.fib(x) == y

    where:
                   x    |    y
                  11    |    89

  }

}
