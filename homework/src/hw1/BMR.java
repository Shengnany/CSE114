//Shengnan You
//112361646
//CSE 114
//HW#1
import java.util.Scanner;
public class BMR {
    public static void main(String[] args) {
        double w,h,a,w1,h1,BMR1,BMR2;
        Scanner num= new Scanner(System.in);
        System.out.print("Enter the person’s weight in pounds: ");
        w=num.nextDouble();
        System.out.print("Enter the person’s height in inches: ");
        h=num.nextDouble();
        System.out.print("Enter the person’s age: ");
        a=num.nextDouble();
        w1=w*0.453592;
        h1=h*2.54;
        BMR1= 10.0*w1 + 6.25*h1-5.0*a+5;
        System.out.println("BMR for a man: "+BMR1+"kcal/day");
        BMR2= 10.0*w1 + 6.25*h1-5.0*a-161;
        System.out.println("BMR for a woman: "+BMR2+"kcal/day");

    }
}
