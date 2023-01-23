class College{
    var cl_name:String="VIT";
    var cl_place:String="Pune";

    fun display(){
        println("$cl_name $cl_place")
    }

    inner class Branch{
        var br_name:String="Instru";
        var br_place:String="Pune";

        fun branchdisplay(){
            println("$br_name $br_place")
        }
    }

    inner class Student{
        var st_name:String="Rohit";
        var st_id:Int=1;

        fun studDisplay(){
            println("$st_name $st_id")
        }
    }
}

fun main(){
    var obj=College();
    obj.display();
    obj.Branch().branchdisplay();
    obj.Student().studDisplay();



}