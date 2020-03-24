//Shengnan You
//112361646
//CSE 114
//lab#4
import java.util.Scanner;
public class CheckSSN {
    public static void main(String[] args) {
        Scanner butter = new Scanner(System.in);
        System.out.print("Enter a SSN:");
        String ssn = butter.nextLine();
        if (!ssn.matches("\\d{3}-\\d{2}-\\d{4}$"))
            System.out.println(ssn + " is not a valid social security number");

        else
            System.out.printf(ssn + " is a valid social security number");


    }
}

