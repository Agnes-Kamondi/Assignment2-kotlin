fun main() {
  var y=  greetings("hello","Agnes")
    println(y)

   var x= remainder(7,2)
    println(x)

    var sum =add(5,10,20,30)
    println(sum)

    var sentence =about('I',"am","Phenomenal")
    println(sentence)


}
fun greetings(one :String,name :String): String{
    var result = one + name
    return result
}

fun remainder(num1:Int,num2:Int):Int{
    var rem = num1 % num2
    return rem
}
fun add(numa:Int,numb:Int,numc:Int,numd:Int):Int{
    var sum = numa +numb +numc +numd
    return sum
}
fun about(agnes:Char,auma:String,kamondi:String) :String{
    var agnes = 'I'
    var auma = "am"
    var kamondi = "Phenomenal"
    var sentence = agnes + auma +kamondi
    return sentence

}