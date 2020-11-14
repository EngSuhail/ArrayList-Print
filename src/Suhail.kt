fun main() {

    val engineers = ArrayList<String>()

    engineers.add("Suhail Alansary")
    engineers.add("Adel Saad")
    engineers.add("Mostafa Alnagar")
    engineers.add("Ibrahim Basem")
    engineers.add("Mohammed Ahmed")
    engineers.add("Ahmed Hesham")
    engineers.add("Sherif Mostafa")
    engineers.add("Ali Arafat")
    engineers.add("Ashraf Kamal")
    engineers.add("Khaled Hamed")

    println("The Engineers in my company are:\n")
   //1st method to print the elements
    for (i in engineers)
        println("Eng. $i")

   //2nd method to print the elements
    for (i in 0..engineers.size-1)
        println("Eng. " + engineers[i])

}