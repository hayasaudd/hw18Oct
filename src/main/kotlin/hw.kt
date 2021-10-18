import java.io.File
fun main() {
   //EX1==============================================================================================
/*
   var MyFAVCity = mutableListOf("Riyadh", "Hail", "Jeddah")
    println(MyFAVCity)
    MyFAVCity.addAll(0, listOf("Dammam", "Qassim"))//add more 2 elements
    println(MyFAVCity)
    MyFAVCity[4]="JEDDAH" //udate last element to kabital litter
    println(MyFAVCity)
   for (index in 0 until MyFAVCity.size){
     println( "$index-.${MyFAVCity[index]}")
   }*/



   //EX2============================================================================


   var numberslist = mutableListOf(1, 2, 3, 4, 5)//create list of 5 numbers
   println(numberslist)
   numberslist[2]=12//ubdate 3th element to number 12
   println(numberslist)
  var check = numberslist.indexOf(12)//check the 12 element in list or not
   println("the element 12 in index: ")
   println(check)
   numberslist.removeAt(check)//delete element 12
   println(numberslist)// print the list

//option exercise1===================================
var filenum=File("data/numberlist.txt").readText().split("/n")


println(filenum)


}