package com.berov.algos.sort;

class Select {

  private final def mock;

  Select(def mock) {
    this.mock = mock;
  }

  def sort(arr) {
    def n = arr.size();
    if (n < 2) {
      return arr;
    }

    for (int i = 0; i < (n-1); i++) {
      def min = i;
      for (int y = i + 1; y < n; y++)
        if (arr[y] < arr[min]) {
          min = y;
        }
        def tmp = arr[min];
        arr[min] = arr[i];
        arr[i] = tmp;
    }
    return arr;
  }
}
