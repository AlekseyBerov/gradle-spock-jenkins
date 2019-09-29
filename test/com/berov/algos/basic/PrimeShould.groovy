package com.berov.algos.basic

import mocks.Mocky
import spock.lang.Specification

class PrimeShould extends Specification {

  private Prime prime
  private def mock

  void setup() {
      //mock = Spy(Mocky)
      prime = new Prime()
  }

  def 'Expect from Prime'() {
    expect:
      prime.isPrime(x) == y

    where:
                   x    |    y
                  29    |   true
                  32    |   false
                  42    |   false
                  7     |   true

  }

}
