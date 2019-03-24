package testing

class D {
    def checkPrimeNumber(def input){
        def isPrime = true
        for (def i = 2; i < (input/2); i++) {
            if(input % i == 0){
                isPrime = false
                break
            }
        }
       if (isPrime) {
           println "This is a prime number"
           return
       }
       println "This is not a prime number"
    }
}