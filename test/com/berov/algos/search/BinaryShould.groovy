package com.berov.algos.search

import mocks.Mocky
import spock.lang.Specification

class BinaryShould extends Specification {

  private Binary binary
  private def mock

  void setup() {
      //mock = Spy(Mocky)
      binary = new Binary()
  }

  def 'Binary Search'() {
    expect:
      binary.search(x,y) == z

    where:
                          x  |       y  |   z
               [1,3,3,6,7,9] |      3   |   [0, 3]
[4,4,4,5,5,5,7,8,9,13,15,17] |      5   |   [2, 6]
[4,4,4,5,5,5,7,8,9,13,15,17] |      12  |   [8, 9]

  }

}
