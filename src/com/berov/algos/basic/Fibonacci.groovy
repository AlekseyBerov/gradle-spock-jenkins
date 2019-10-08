package com.berov.algos.basic

class Fibonacci {

  def getFib(int n) {
    if (n <= 1) {
      return n;
    }
    def fib = [0,1] + [0] * (n - 1);
    (2..n).each {
        fib[it] = fib[it - 1] + fib[it - 2];
    }
    return fib[-1];
  }

}
