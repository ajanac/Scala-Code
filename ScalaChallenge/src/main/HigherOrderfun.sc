val double= (i:Int) => (i*2)
def highOrderFunc(x:Int,y: Int => Int)= y(x)

highOrderFunc(6,double)

val triple= (i:Int) => i*3

highOrderFunc(6,triple)

// Returns another function
def sayHello=(x:String) =>"Hello"+" "+x

sayHello("Ajana")

var message=sayHello("Sathian")
val y=5
// multipler is a closure function
val multipler=(x:Int) => x*y
multipler(10)