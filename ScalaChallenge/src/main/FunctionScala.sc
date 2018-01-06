def abs(x:Int)=if (x<0) -x else x
abs(-5)
def fac(n:Int)={
  var r=1
  for (i <- 1 to n)r*=i
  r
}
fac(5)

def factorial(n:Int):Int = if (n<=0)1 else n*factorial(n-1)
factorial(5)

def printName(first:String,last:String)=println(first+" "+last)

printName(first = "ajana",last = "Sathian ")
printName(last = "Sathian",first = "Ajana")
printName("Topy","Girly")

// Function with Default value

def printNameModfided(left:String="[",first:String,last:String,right:String="]")=
println(left+first+" "+last+right)
printNameModfided(first="Ajana",last="Sathian")

def sum(args:Int*)={
  var result=0
  for(arg <-args)result+=arg
  result
}
sum(1,2,3,4,5)