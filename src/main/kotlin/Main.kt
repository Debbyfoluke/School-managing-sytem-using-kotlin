import java.util.*

fun main(args: Array<String>) {
    val principal = PrincipalLogin()
    val teacher = TeacherLogin()
    val student = StudentLogin()
    val scanner = Scanner(System.`in`)

    println("Hello.." +
        "\n" +
        "Enter 1 to login as the Principal:" +
        "\n" +
        "Enter 2 to login as the Teacher:" +
        "\n" +
        "Enter 3 to login as the Student:"
    )

    var loginCode = 0

    try {
        loginCode = scanner.nextInt()
    } catch (e: Exception) {
        println("Wrong password")
    }

    var principalAction = 0
    var teacherAction = 0
    var StudentAction = 0
    if (loginCode == 1) {
        println(
            "Hi.. " +
                    "\n" +
                    "Enter 1 to printStudent: " +
                    "\n" +
                    "Enter 2 to printSubjct : " +
                    "\n" +
                    "Enter 3 to printStaffs: " +
                    "\n" +
                    "Enter 4 to printClasses :"
        )
        try {
            principalAction = scanner.nextInt()
        } catch (e: java.lang.Exception) {
            println("Wrong password")
            principalAction = scanner.nextInt()
        }
        if (principalAction == 1) {
            principal.printStudents()
        } else if (principalAction == 2) {
            principal.printSubject()
        } else if (principalAction == 3) {
            principal.printStaff()
        } else if (principalAction == 4) {
            principal.printClasses()
        } else println("Incorrect password please try again")
    } else if (loginCode == 2) {
        println(
            "Hi.. " +
                    "\n" +
                    "Enter 5 to printStudent: " +
                    "\n" +
                    "Enter 6 to printSubject : " +
                    "\n" +
                    "Enter 7 to printClasses : " +
                    "\n" +
                    "Enter 8 to assignScore"
        )
        try {
            teacherAction = scanner.nextInt()
        } catch (e: java.lang.Exception) {
            println("Wrong password")
            teacherAction = scanner.nextInt()
        }
        if (teacherAction == 5) {
            teacher.printStudents()
        } else if (teacherAction == 6) {
            teacher.printSubject()
        } else if (teacherAction == 7) {
            teacher.printClasses()
        } else if (teacherAction == 8) {
            teacher.assignScore()
        } else println("Wrong password try again")
    } else if (loginCode == 3) {
        println(
            ("Hi.. " +
                    "\n" +
                    "Enter 14 to printSubject : " +
                    "\n" +
                    "Enter 12 to printSubClasses : ")
        )
        try {
            StudentAction = scanner.nextInt()
        } catch (e: java.lang.Exception) {
            println("Wrong password")
            StudentAction = scanner.nextInt()
        }
        if (StudentAction == 14) {
            student.printSubject()
        } else if (StudentAction == 12) {
            student.printClasses()
        } else println("Incorrect pin")
    } else println("Wrong password")
}

