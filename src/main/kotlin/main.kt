fun main(){
    val classrom42 = ClassRoom(42)
    val classrom41 = ClassRoom(41)

    classrom42.setServerId()

    classrom42.printClassrom()
    classrom41.printClassrom()
}

fun studentsExample(){
    val students = mutableListOf<Student>()

    Student.id = 5

    for(i in 1..10){
        students.add(Student("Przemysław","Stokłosa"))
    }

    println(students)

    Student.id = 0

    for(i in 1..10){
        students.add(Student("Przemysław","Stokłosa"))
    }

    println(students)
    println(Student.id)

    var number : Double? = null

    //number = 5.0
    //number = 10.0

    var no1 = 10.0
    number = no1
}
