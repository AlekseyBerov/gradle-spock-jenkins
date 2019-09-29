package com.berov.algos.sort;

class Merge {

  def sort(arr) {
    int n = arr.size();
    if (n < 2) {
      return;
    }
    int middle = n / 2;

    def L = (0..middle-1).collect { arr[it] };
    def R = (middle..n-1).collect { arr[it] };

    sort(L);
    sort(R);

    def c = merge(L,R)
    for (int i = 0; i < arr.size(); i++) {
      arr[i] = c[i];
    }
    return arr;
  }

  def merge(a,b) {
    def c = [];
    def i = 0; // for a array
    def k = 0; // for b array

    while (i < a.size() && k < b.size()) {
      if (a[i] <= b[k]) {
        c << a[i];
        i++;
      } else {
        c << b[k];
        k++;
      }
    }
    while (i < a.size()) {
      c << a[i];
      i++;
    }
    while (k < b.size()) {
      c << b[k];
      k++;
    }
    return c;
  }
}
