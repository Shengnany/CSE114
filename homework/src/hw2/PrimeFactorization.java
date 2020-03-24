//Shengnan You
////112361646
////CSE 114
////HW#2
import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner butter = new Scanner(System.in);
        System.out.print("Enter integers: ");
        String first = butter.next();
        double value = Double.parseDouble(first);
        String ant;
        int total = 1;
        if (value <= 0)
            System.out.println("Bad input.");
        else {
            while (value>0) {
                total *= value;
                ant = butter.next();
                value = Double.parseDouble(ant);
            }
            System.out.println("Product: "+total);
            System.out.print("Prime factorization: ");
            int n;
            n = total;
            for (int i = 2; i <= n; i++)
             {  int counter= 0;
                while (total % i == 0)
                {
                    total /= i;
                    counter++;

                }
                if(counter>0)
                System.out.print(i+"^"+counter+" ");

            }

            }


        }
    }

