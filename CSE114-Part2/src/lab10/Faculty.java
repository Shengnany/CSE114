//Shengnan You
//112361646
//CSE 114
//Lab#10
package lab10;
public class Faculty extends Employee {
    private int officeHours;
    private int rank;
    public static final int LECTURER=1;
    public static final int ASSISTANT_PROFESSOR=2;
    public static final int ASSOCIATE_PROFESSOR=3;

    Faculty(String name){
setName(name);
    }

public String toString(){
        return getName()+", "+"Class name: Faculty";
}


}
