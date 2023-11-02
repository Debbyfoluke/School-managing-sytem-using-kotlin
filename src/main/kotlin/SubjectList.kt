 class SubjectList: SubjectPrinter{
    val name: String
    var score: Int

    constructor(name: String, score: Int = 0) {
        this.name = name
        this.score = score
    }

     override fun printSubject() {

     }

     override fun toString(): String {
         return "SubjectList(name='$name', score=$score)"
     }
 }
interface SubjectPrinter {


    fun printSubject()
}


