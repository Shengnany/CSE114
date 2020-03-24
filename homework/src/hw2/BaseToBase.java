//Shengnan You
//112361646
//CSE 114
//HW#2
import java.util.Scanner;


public class BaseToBase {

 public  static int change(char a)
    {
        if (a >= '0' && a <= '9')
            return ((int)a - '0');
        else
            return ((int)a - 'A' + 10);
    }
  public  static char back(int b)
    {
        if (b >= 0 && b <= 9)
            return (char)(b + '0');
        else
            return (char)(b +'A'- 10 );
    }
    public static void main(String[] args) {
        Scanner butter= new Scanner(System.in);
        System.out.print("Enter number: ");
        String num= butter.nextLine();
        System.out.print("Enter starting base: ");
        int stBase= butter.nextInt();
        System.out.print("Enter ending base: ");
        int enBase= butter.nextInt();

        int len = num.length();
        int power = 1;
        int deci=0;
        int i;

        for (i = len - 1; i >= 0; i--)
        {
           deci = deci + change(num.charAt(i)) * power;
            power = power * stBase;
            System.out.println();
        }

         String output="";
        String temp="";
                 while( deci>0 ){
                     temp=back(deci%enBase)+temp;
                     deci/=enBase;
                 }
        System.out.println("Result: "+output);
    }
}
