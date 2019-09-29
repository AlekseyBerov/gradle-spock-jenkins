package com.berov.algos.sort

import mocks.Mocky
import spock.lang.Specification

class MergeShould extends Specification {

  private Merge merge
  private def mock

  void setup() {
      //mock = Spy(Mocky)
      merge = new Merge()
  }

  def 'Expect from sort'() {
    expect:
      merge.sort(x) == y

    where:
                           x    |    y
   [4,33,1,2,6,3,45,8,7,89,9]   |   [1, 2, 3, 4, 6, 7, 8, 9, 33, 45, 89]
  }

  def 'Expect from merge'() {
    expect:
      merge.merge(x,y) == z
    where:
          x  |    y    |    z
     [1,2,3] | [5,6,7] | [1,2,3,5,6,7]

  }

}
