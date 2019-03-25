package testing

import testing.F

class G {
    def isPalendrome(def inputString) {
        def reverser = new F()
        def reverseString = reverser.revString(inputString)

        if (reverseString == inputString) {
            return true
        }
        return false
    }
}