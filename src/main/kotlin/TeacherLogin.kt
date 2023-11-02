class TeacherLogin() : Admin(), SubjectPrinter, StudentPrinter, ClassesPrinter  {


    override fun printSubject() {
        subject.forEach {
            println(it)
        }
    }

    override fun printStudents() {
        students.forEach {
            println(it)
        }

    }



    override fun printClasses() {
        classes.forEach {
            println(it)
        }
    }

    fun assignScore() {
        println("Before assigning$subject")
        val sub = subject[3]
        sub.score = 80
        subject[3] = sub
        println("After assigning$subject")
    }

    override fun printLists() {
        super.printLists()
    }
}