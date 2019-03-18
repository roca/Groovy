def f = new File("./testing/Strings.groovy")
def fr = new FileReader(f)
def i = fr.read()

while(i != -1) {
    print((char)i)
    i = fr.read()
}