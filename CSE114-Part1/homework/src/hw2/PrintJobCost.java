//Shengnan You
////112361646
////CSE 114
////HW#2

import java.util.Scanner;
public class PrintJobCost {
    public static void main(String[] args) {
        Scanner butter= new Scanner(System.in);
        System.out.print("Enter print job info: ");
        String PaperSize=butter.next();
        String ColorType=butter.next();
        int Count=butter.nextInt();
        double cost1=0;
            double cost2=0;
        if (PaperSize.equals("Letter"))
            cost1= 0.05;
        else if (PaperSize.equals("Legal"))
            cost1=0.06;
        else if(PaperSize.equals("A4"))
            cost1=0.055;
        else if (PaperSize.equals("A5"))
            cost1=0.04;
        if (ColorType.equals("Grayscale"))
            cost2=0.01;
        else cost2=0.10;

        double total=(cost1+cost2)*Count;
        System.out.printf("Print job cost: $%.2f\n ",total);



    }
}
