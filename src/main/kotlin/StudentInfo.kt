class StudentInfo: StudentPrinter {
    val name: String
    val age: Int
    val presentClass: String
    val department: String
    val subjects: String
    val sex: String

    constructor(name: String, age: Int, presentClass: String, department: String, subjects: String, sex: String) {
        this.name = name
        this.age = age
        this.presentClass = presentClass
        this.department = department
        this.subjects = subjects
        this.sex = sex
    }

    override fun printStudents() {

    }

    override fun toString(): String {
        return "StudentInfo(name='$name', age=$age, presentClass='$presentClass', department='$department', subjects='$subjects', sex='$sex')"
    }
}
interface StudentPrinter {
   fun printStudents()


}