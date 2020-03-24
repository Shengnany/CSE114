import java.util.Scanner;
public class  mine {

    public static void main(String[] args)
    {
        Scanner butter = new Scanner(System.in);
        System.out.print(" Enter today's day: ");
        int day = butter.nextInt();
        System.out.print(" Enter the number of days elapsed since today: ");
        int time = butter.nextInt();
        int future = day + (time%7);

        switch(day) {
            case 0:
                System.out.print("Today is Sunday");
                break;
            case 1:
                System.out.print("Today is Monday");
                break;
            case 2:
                System.out.print("Today is Tuesday");
                break;
            case 3:
                System.out.print("Today is Wednesday");
                break;
            case 4:
                System.out.print("Today is Thursday");
                break;
            case 5:
                System.out.print("Today is Friday");
                break;
            case 6:
                System.out.print("Today is Saturday");
                break;
        }

        switch(future)
        {
            case 0:
                System.out.print(" and the future day is Sunday");
                break;
            case 1:
                System.out.print(" and the future day is Monday");
                break;
            case 2:
                System.out.print(" and the future day is Tuesday");
                break;
            case 3:
                System.out.print(" and the future day is Wednesday");
                break;
            case 4:
                System.out.print(" and the future day is Thursday");
                break;
            case 5:
                System.out.print(" and the future day is Friday");
                break;
            case 6:
                System.out.print(" and the future day is Saturday");
                break;
        }

    }
}
