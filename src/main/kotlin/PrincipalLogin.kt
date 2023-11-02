class PrincipalLogin() : Admin(), StaffPrinter, StudentPrinter, SubjectPrinter, ClassesPrinter {
    val staffList: MutableList<StaffInfo> = mutableListOf(
        StaffInfo(
            "name",
            34,
            "Bsc",
            "09030456219",
            "femoK@gmail.com",
            "5",
            "teacher"
        ),

        StaffInfo(
            "name", 50,
            "Masters",
            "08129504123",
            "lilian@gmail.com",
            "20",
            "teacher"
        ),

        StaffInfo(
            "name",
            40,
            "Ssce",
            "07080197200",
            "Giwa@gmail.com",
            "5",
            "security"
        )
    )

    override fun printStaff() {
        staffList.forEach {
            println(it)
        }
    }

    override fun printStudents() {
        students.forEach {
            println(it)
        }
    }

    override fun printSubject() {
        subject.forEach {
            println(it)
        }
    }

    fun addToStaffList() {
        staffList.add(StaffInfo("name", 45, "HND", "08064002711", "jimmy@gmail.com", "10"))
        println(staffList)
    }

    fun  removeFromStaffList(){
        staffList.removeAt(1)
        println(staffList)
    }

    fun addToStudents() {
        students.add(StudentInfo("name", 16, "SS3", "Art", "3", "Male"))
        println(students)
    }

    fun removeFromStudent() {
        students.removeAt(0)
        println(students)
    }

    override fun printClasses() {

    }

    override fun printLists() {
        super.printLists()
    }
}