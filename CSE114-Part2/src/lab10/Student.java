//Shengnan You
//112361646
//CSE 114
//Lab#10
package lab10;
public class Student extends Person {
    private int classStatus;
    public static final int FRESHMAN=1;
    public static final int SOPHOMORE=2;
    public static final int JUNIOR=3;
    public static final int SENIOR=4;
Student(String  name){
    setName(name);

}

@Override
    public String toString(){
    return getName()+", "+"Class name: Student";
}

}
