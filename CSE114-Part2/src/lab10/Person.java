//Shengnan You
//112361646
//CSE 114
//Lab#10
package lab10;
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    Person(){
        System.out.println("good");
    }
    Person(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
public String  getName(){
        return name;
}
     public String toString(){
         return name+", "+"Class name: Person";
     }

   private void print(){

     }
}
