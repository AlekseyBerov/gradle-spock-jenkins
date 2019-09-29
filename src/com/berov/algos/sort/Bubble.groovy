package com.berov.algos.sort;

class Bubble {

  private final def mock;

  Bubble(def mock) {
    this.mock = mock;
  }

  def sort(arr) {
    int n = arr.size();
    if (n < 2) {
      return arr;
    }

    int temp = 0;
      for(int i=0; i < n; i++) {
        for(int j=1; j < (n-i); j++) {
          if(arr[j-1] > arr[j]){
            temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
          }
        }
      }
    return arr;
  }
}
