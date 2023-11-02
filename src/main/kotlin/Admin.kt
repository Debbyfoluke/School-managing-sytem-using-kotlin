open class Admin() {


    val students: MutableList<StudentInfo> = mutableListOf(
        StudentInfo(
            "name",
            15,
            "SS1",
            "Art",
            "3",
            "Male"

        ),
        StudentInfo(
            "name",
            17,
            "SS2",
            "Commrcial",
            "4",
            "Female"
        ),
        StudentInfo(
            "name",
            17,
            "SS2",
            "Art",
            "3",
            "Female"
        ),
        StudentInfo(
            "name",
            17,
            "SS2",
            "Science",
            "5",
            "Female"
        )
        )

    val subject: MutableList<SubjectList> = mutableListOf(
        SubjectList(
            "name", 70,
        ),
        SubjectList(
            "name",
            54
        ),
        SubjectList(
            "name",
            68
        ),
        SubjectList(
            "name",
            70
        )
    )

    val classes = mutableListOf("ss1", "ss2")

    open fun printLists() {
        println(students)
        println(subject)
        println(classes)
    }

}