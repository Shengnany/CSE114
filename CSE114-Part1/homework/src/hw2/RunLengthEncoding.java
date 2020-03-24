//Shengnan You
//112361646
//CSE 114
//HW#2
import java.util.Scanner;
public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner butter = new Scanner(System.in);
        System.out.print("Enter input string: ");
        String input = butter.nextLine();
        System.out.print("Enter flag character: ");
        String flag = butter.nextLine();


        int n = input.length();



        for (int k = 0; k < n; k++) {
            if ((input.charAt(k) < 'A' || input.charAt(k) > 'Z')) {
                System.out.print("Bad input");
                System.exit(0);
            }
        }




        if (flag.equals("#") || flag.equals("$") || flag.equals("&") || flag.equals("*")) {
            int i =0;
            int counter;
            while (i < n ) {
                counter = 1;
                while (i<n-1) {
                  if   (input.charAt(i) == input.charAt(i + 1))
                  { counter++; i++;}
                  else
                    break;

                }

                if (counter == 1)
                {System.out.print(input.charAt(i));}
               else  if (counter == 2)
                    System.out.print(String.valueOf(input.charAt(i)) + input.charAt(i));
               else  if (counter == 3)
                    System.out.print(String.valueOf(input.charAt(i)) + input.charAt(i)+ input.charAt(i));
                else
                    System.out.print(flag + input.charAt(i) + counter );
                       i++;

            }
        } else {
            System.out.println("Bad input");
        }


    }
}

