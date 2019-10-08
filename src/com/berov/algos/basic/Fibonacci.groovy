package com.berov.algos.basic

class Fibonacci {

  def fib(int n) {
    if (n <= 1) {
      return n;
    }
    fib = [0,1] + [0] * (n - 1);
    (2..n).each {
        fib[it] = fib[it - 1] + fib[it - 2];
    }
    return 99;
  }

}
