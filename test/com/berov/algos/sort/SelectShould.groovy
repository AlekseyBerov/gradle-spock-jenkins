package com.berov.algos.sort

import mocks.Mocky
import spock.lang.Specification

class SelectShould extends Specification {

  private Select select
  private def mock

  void setup() {
      mock = Spy(Mocky)
      select = new Select(mock)
  }

  def 'Expect from Select'() {
    expect:
      select.sort(x) == y

    where:
                   x    |    y
                  [2]   |   [2]
            [4,3,1,2]   |   [1,2,3,4]
    [5,-1,0,-14,0,32]   |   [-14,-1,0,0,5,32]

  }

}
