import testing.A
import java.util.logging.Logger;

// Classes and Methods
println "-----------Classes and Methods-----------"
def obj1 = new A(2,3)
def obj2 = new A()

println obj1.y


// Conditionals
println "-----------Conditionals-----------"

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

println "-----------Loops-----------"

def i
for (i=10;i>=1;i--) {
    println 10*i
}

println "-----------While Loops-----------"

def ii=10

while(ii>=1){
    println  10*ii
    ii--
}

println "-------------Arrays------------"

def arr=[34,56,12,75]

def arr2 = new String[3]

arr2[2] = "hello"
arr2[1] = "testing"

println "Size of arr2: " + arr2.size()

for (b in arr2) {
   println b 
}

println "----------ForEach Loop ---------"

for (def b : [1,2,3,4,5]) {
   println b 
}
