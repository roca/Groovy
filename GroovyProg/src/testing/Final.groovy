import testing.A
import java.util.logging.Logger;

// Classes and Methods
def obj1 = new A(2,3)
def obj2 = new A()

println obj1.y


// ConditionalsA

def final Logger LOGGER = Logger.getLogger(A.class.getName());

def a=21
if(a<0)
{
    println "This is Negatine Number"
}
else if(a==0)
{
    println "This is ZERO"
}
else if(a%2==0)
{
    println "Even Value"
}
else
{
    LOGGER.info "Odd Value"
}
