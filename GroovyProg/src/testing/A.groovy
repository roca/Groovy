package testing

class A{

    def final y=4

    def A(def a,def b)
    {
        def  c=a*b
        println c
    }

    def A()
    {
        println "This is Constructor"
    }

    def hello()
    {
        println i
        println "This is hello Method"
    }

    def sum(def a,def b)
    {
        def c = a + b
        println c
    }

    def sub(def a, def b)
    {
        def c=a-b
        return c
    }

    def numberSwap(def a,def b){
        a=a+b
        b=a-b
        a=a-b  
       println "Final value of a is " + a
       println "Final value of b is " + b
    }
}

