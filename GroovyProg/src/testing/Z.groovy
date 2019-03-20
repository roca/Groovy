import testing.A
import testing.B

def obj = new A()
def obj2 = new B()

def values = [100,200]
values = obj.numberSwap(values)
println values

def x = args[0]
obj2.checkEvenOdd(x)
println this.args[0]
