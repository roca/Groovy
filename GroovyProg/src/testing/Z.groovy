import testing.A
import testing.B
import testing.C

import groovy.time.*
import groovy.transform.*


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

// def obj = new A()
// def obj2 = new B()

// def values = [100,200]
// values = obj.numberSwap(values)
// println values



// def var = this.args[0].toInteger()
// obj2.checkEvenOdd(var)






def var = this.args[0].toInteger()

// def obj = new C()
// obj.checkGrade(var)


//def obj = new MemoizedExample()

def fib(n) {
   def fibber = new Fibber();
   while(fibber.current < n) fibber.next()
   return fibber.fib
}


def timeStart = new Date()
println fib(var)
def timeStop = new Date()

TimeDuration duration = TimeCategory.minus(timeStop, timeStart)

println duration








