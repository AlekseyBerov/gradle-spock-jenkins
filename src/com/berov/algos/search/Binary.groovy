package com.berov.algos.search;

class Binary {

  def search(arr,key) {

    def range = [];
    def L = left_bound(arr,key);
    def R = right_bound(arr,key);

    range << L << R;

    return range;
  }

  def left_bound(arr,key) {
    int left = -1;
    int right = arr.size();
    while (right - left > 1) {
      int middle = (left + right) / 2;
      if (arr[middle] < key) {
        left = middle;
      } else {
        right = middle;
      }
    }
    return left;
  }

  def right_bound(arr,key) {
    int left = -1;
    int right = arr.size();
    while (right - left > 1) {
      int middle = (left + right) / 2;
      if (arr[middle] <= key) {
        left = middle;
      } else {
        right = middle;
      }
    }
    return right;
  }


}
