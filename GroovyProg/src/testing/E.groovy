
package testing

import groovy.transform.


class Fibber {
  def old=1,fib=1,current=1


  def next() {
    def newFib=fib+old
    old=fib
    fib=newFib
    current++
  }
}

class MemoizedExample {
 
    @Memoized

    def fib(n) {
    if (n<2) return 1
    else return fib(n-1) + fib(n-2)
    }
}
