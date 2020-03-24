package hw3;//Shengnan You
//112361646
//CSE 114
//HW#3
import java.util.Scanner;

public class ISBN13Checksum  {
    public static void main(String[] args){
        Scanner butter=new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn= butter.nextLine();

        int k=0;
        for (int i = 0; i < isbn.length(); i++) {
            char a= isbn.charAt(i);
            if(Character.isDigit(a)) k++;
        }

        if(k<12) {
            System.out.printf("%s is an invalid input",isbn);

        }

        else{
            int[] isbn1 = new int[13];
            int sum = 0;
            for (int i = 0; i < isbn.length(); i++) {
                if (i % 2 == 0) sum += isbn.charAt(i) - '0';
                else sum += 3 * (isbn.charAt(i) - '0');
                isbn1[i] = isbn.charAt(i) - '0';
            }


            int sumCheck = 10 - sum % 10;
            if (sumCheck == 10) sumCheck = 0;
            isbn1[isbn1.length - 1] = sumCheck;


            System.out.print("The ISBN-13 number is: ");
            for (int i = 0; i < isbn1.length; i++) {
                System.out.print(isbn1[i]);
            }
        }
    }

}
