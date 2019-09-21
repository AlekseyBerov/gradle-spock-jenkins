package com.berov.algos.sort

import mocks.Mocky
import spock.lang.Specification

class BubbleShould extends Specification {

  private Bubble bubble
  private def mock

  void setup() {
      mock = Spy(Mocky)
      bubble = new Bubble(mock)
  }

  def 'Expect from Bubble'() {
    expect:
      bubble.sort(x) == y

    where:
                   x    |    y
            [4,3,1,2]   |   [1,2,3,4]
    [5,-1,0,-14,0,32]   |   [-14,-1,0,0,5,32]

  }

}
