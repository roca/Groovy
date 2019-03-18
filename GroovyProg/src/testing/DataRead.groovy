def f = new File("./testing/Strings.groovy")
def fr = new FileReader(f)
def i = fr.read()

while(i != -1) {
    print((char)i)
    i = fr.read()
}


def f2 = new File("./testing/Final.groovy")
def fr2 = new FileReader(f2)
def br = new BufferedReader(fr2)

def s = br.readLine()

while(s != null) {
    println s
    s = br.readLine()
}