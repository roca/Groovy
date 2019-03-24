package testing

class F {
   // Reverse a string
   def revString(def inputString){
       def reverse = ""
       for (def i = inputString.length()-1; i >= 0; i--) {
           reverse = reverse + inputString.toCharArray()[i]
       }
       println reverse
   }
}