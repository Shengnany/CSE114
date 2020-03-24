//Shengnan You
//112361646
//CSE 114
//HW#1
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = car.nextInt();
        int j = year;
        while (j > 100) {
            j /= 10;
        }
        j = j + 1;
        int k = year % 100;
        System.out.print("Enter month (1-12): ");
        int m = car.nextInt();
        if (m == 1) {
            m = 13;
        } else if (m == 2) {
            m = 14;
        }
        System.out.print("Enter the day of the month (1-31): ");
        int q = car.nextInt();

        double h;
        h = ((q + (13.0 * (m + 1) / 5.0) + k + (k / 4.0) + (j / 4.0) + (5 * j))) % 7;
        int d=(int)h;

        switch (d) {
            case 0:
                System.out.println("The day of the week is : Saturday");
                break;
            case 1:
                System.out.println("The day of the week is : Sunday");
                break;
            case 2:
                System.out.println("The day of the week is : Monday");
                break;
            case 3:
                System.out.println("The day of the week is : Tuesday");
                break;
            case 4:
                System.out.println("The day of the week is : Wednesday");
                break;
            case 5:
                System.out.println("The day of the week is : Thursday");
                break;
            case 6:
                System.out.println("The day of the week is : Friday");
                break;
        }
    }

}