package com.berov.algos.sort

import mocks.Mocky
import spock.lang.Specification

class QuickShould extends Specification {

  private Quick quick
  private def mock

  void setup() {
      //mock = Spy(Mocky)
      quick = new Quick()
  }

  def 'Expect from Quick Tony Hoare sort'() {
    expect:
      quick.hoare_sort(x) == y

    where:
                   x    |    y
                  [2]   |   [2]
            [4,3,1,2]   |   [1,2,3,4]
    [5,-1,0,-14,0,32]   |   [-14,-1,0,0,5,32]
[4,33,1,2,6,3,45,8,7,89,9] | [1, 2, 3, 4, 6, 7, 8, 9, 33, 45, 89]

  }

}
