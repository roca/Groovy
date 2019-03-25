package testing

import testing.F

class G {
    def isPalendrome(def inputString) {
        def stringReverser = new F()

        if (stringReverser.revString(inputString).equals(inputString)) {
            return true
        }
        return false
    }
}