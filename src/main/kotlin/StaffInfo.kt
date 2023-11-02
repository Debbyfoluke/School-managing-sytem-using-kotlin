class StaffInfo(
    val name: String,
    val age: Int,
    val qulification: String,
    val mobileNumber: String,
    val emailAddress: String,
    val workingEperience: String,
    val role: String = "teacher"
) : StaffPrinter {

    override fun printStaff() {

    }

    override fun toString(): String {
        return "StaffInfo(name='$name', age=$age, qulification='$qulification', mobileNumber='$mobileNumber', emailAddress='$emailAddress', workingEperience='$workingEperience', role='$role')"
    }

}

interface StaffPrinter {
    fun printStaff()


}