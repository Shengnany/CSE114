//Shengnan You
//112361646
//CSE 114
//Lab#10
package lab10;
public class Employee extends Person {

        private String office;
        private int salary;
        private String date;
        Employee() {
            System.out.println("goo2");
        }
        Employee(String name) {
            setName(name);

        }


        @Override
        public String toString () {
            return getName() + ", " + "Class name: Employee";
        }

    }

