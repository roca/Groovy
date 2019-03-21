import testing.A
import testing.B
import testing.C

// def obj = new A()
// def obj2 = new B()

// def values = [100,200]
// values = obj.numberSwap(values)
// println values



// def var = this.args[0].toInteger()
// obj2.checkEvenOdd(var)



import groovy.time.*
import groovy.transform.*


class MemoizedExample {
 
    @Memoized

    def fib(n) {
    if (n<2) return 1
    else return fib(n-1) + fib(n-2)
    }
}


def var = this.args[0].toInteger()

// def obj = new C()
// obj.checkGrade(var)


def obj = new MemoizedExample()


def timeStart = new Date()
println obj.fib(var)

def timeStop = new Date()
TimeDuration duration = TimeCategory.minus(timeStop, timeStart)

println duration








