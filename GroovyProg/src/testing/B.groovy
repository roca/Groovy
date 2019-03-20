package testing

class B {

    def checkEvenOdd(def a){
        if(a<0)
        {
            println "This is Negatine Number --> " + a
        }
        else if(a==0)
        {
            println "This is Number ZERO --> " + a
        }
        else if(a%2 == 0){
            println "This Number is Even --> " + a
        } else {
            println "This Number is Odd --> " + a
        }
    }

}