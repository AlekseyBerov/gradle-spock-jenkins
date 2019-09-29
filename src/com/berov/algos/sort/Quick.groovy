package com.berov.algos.sort;

class Quick {

  def hoare_sort(arr) {
    int n = arr.size();
    if (n < 2) {
      return arr;
    }

    def L = [];
    def M = [];
    def R = [];
    def barrier = arr[0];

    for (x in arr) {
      if (x < barrier) {
        L << x;
      } else if (x == barrier) {
        M << x;
      } else {
        R << x;
      }
    }
    hoare_sort(L);
    hoare_sort(R);
    int k = 0;
    for (x in L + M + R) {
        arr[k] = x;
        k++;
    }
    return arr;
  }
}
