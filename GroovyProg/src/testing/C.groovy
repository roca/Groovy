package testing

class C {

    def checkGrade(def number){
        switch(number){
            case {it < 0 || it > 100}:
                println "You entered invalid number --- " + number
                break
            case {it >= 0 && it <= 30}:
                println "You are Failed --- " + number
                break
            case {it > 30 && it <= 45}:
                println "You are Third --- " + number
                break
            case {it > 45 && it <= 59}:
                println "You are Second --- " + number
                break
            default:
                println "You are First --- " + number
                break
        }
    }
}