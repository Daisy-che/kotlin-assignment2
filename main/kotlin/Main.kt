fun main(){
var x= print("Daisy")
println(x)
var y=remainder(num1 =7, num2 =20.0)
println(y)
var z= addition(numa= 20,numb=30,numc=40)
println(z)
var w =words("sentence")
println(w)

}
fun print(name: String):String{
    var greetings= "hello"+""+ name
    return greetings


}
fun remainder(num1:Int, num2:Double):Double{
    var module =num1%num2
    return module
}
fun addition(numa:Int,numb:Int,numc:Int):Int{
    var sum =numa+numb+numc
    return sum


}
fun words(text:String):String{
    var sentence="Iam the most amazing person"
    return sentence
}