package com.berov.algos.sort;

class IsSorted {

  def check_sorted(arr, asc = true) {
    def n = arr.size();
    if (n < 2) {
      return true;
    }
    
    int sign = (2 * (asc ? 1 : 0)) - 1;

    for (int i = 0; i < n-1; i++) {
      if (sign * arr[i] > sign * arr[i+1]) {
        return false;
      }
    }
    return true;
  }
}
