package testing

class A{

    def i=100

    def hello()
    {
        def i=200
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
        i=200
        def c=a-b
        return c
    }
}