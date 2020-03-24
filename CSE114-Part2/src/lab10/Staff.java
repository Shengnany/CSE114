//Shengnan You
//112361646
//CSE 114
//Lab#10
package lab10;
public class Staff extends Employee {
    private String tittle;
    Staff(String name){
setName(name);
    }
  @Override
    public String toString(){
      return getName()+",  "+"Class name: Staff";

    }
}
