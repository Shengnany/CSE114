//Shengnan You
//112361646
//CSE 114
//Lab#10
package lab10;
public class University {
    public static void main(String[] args) {
        Person person = new Person("Kelsey");
        Employee employee = new Employee();
       Faculty faculty = new Faculty("Good");
       Staff staff=new Staff("Cute");
       Student student=new Student("Pretty");
        System.out.println(person.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
        System.out.println(student.toString());
new Employee().toString();
    }
}