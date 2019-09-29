package com.berov.algos.sort

import mocks.Mocky
import spock.lang.Specification

class IsSortedShould extends Specification {

  private IsSorted isSorted
  private def mock

  void setup() {
      //mock = Spy(Mocky)
      isSorted = new IsSorted()
  }

  def 'Is the array sorted?'() {
    expect:
      isSorted.check_sorted(x,y) == z

    where:
                  x  |       y         |   z
                 [2] |      true       |   true
           [1,2,3,4] |      true       |   true
           [4,3,2,1] |      false      |   true

  }

}
