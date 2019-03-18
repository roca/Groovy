def s = "  Hello Testing World  "
def s1 = new String("Hello")
def s2 = "World"

// Length and Trim
// def l = s.length()
println "Length of original String is " + s.length()
println "Length after trimming spaces is " + s.trim().length()


// Upper Case and Lower Case
println s.toUpperCase()
println s.toLowerCase()

// replace
println s.replace("Hello","Hi")
println s.replace('s','$')

// Concatination
println "  ".concat(s1.concat(" ").concat(s2))
println "  " + s1 + " " + s2

// To find character at a specific postion
println "Index postion " + s1.indexOf('o') + " of 'Hello' is a " + s1.charAt(4)

// To find out part of the string
println "Substring from of index 3 to 7 is " + (s1 + " " + s2).substring(3,8)

def b = "Hello"
def b1 = "hello"

println  "Ingoring case: ".concat(b.equalsIgnoreCase(b1).toString())
if (b.equalsIgnoreCase(b1)){
    println b + " equals " + b1
} else {
    println b + " dosn't equal " + b1
}
println b.compareTo(b1)

println b.compareToIgnoreCase(b1)

println s.contains("Testing")

println s.split(" ").length


println s1.toCharArray()[0]