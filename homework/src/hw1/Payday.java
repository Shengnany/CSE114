//Shengnan You
//112361646
//CSE 114
//HW#1
import java.util.Scanner;
public class Payday {
    public static void main(String[] args) {
        Scanner may= new Scanner(System.in);
        System.out.print("Choose employee type: (m) manager (h) hourly (c) commission (p) pieceworker: ");
         String choice = may.nextLine();
         switch (choice) {
             case "m": System.out.print("Enter weekly sales：");
                   double mpay=may.nextDouble();
                 System.out.println("Gross pay: $"+mpay);
                   double tax1=mpay*(0.125);
                 System.out.println("Taxes: $"+tax1);
                   double net1=mpay-tax1;
                 System.out.println("Net pay: $"+net1);
                   break;

             case"h":
                 System.out.print("Enter hourly wage: ");
                     double hourWage= may.nextDouble();
                 System.out.print("Enter hours worked: ");
                     double h= may.nextDouble();
                     double hpay;
                 if(h>35) {
                     double h1 = h - 35;
                            hpay = 35 * hourWage + 2 * h1 * hourWage;
                       System.out.println("Grosspay: $"+hpay);
                 }else{
                            hpay=h*hourWage;
                       System.out.println("Grosspay: $"+hpay);
                 }
                     double tax2=hpay*(0.125);
                 System.out.println("Taxes: $"+tax2);
                    double net2=hpay-tax2;
                 System.out.println("Net pay: $"+net2);
                 break;
             case "c":
                 System.out.print("Enter weekly sales: ");
                 double weeklySales= may.nextDouble();
                double cpay= 0.057*weeklySales+250;
                 System.out.println("Grosspay: $"+cpay);
                double tax3=cpay*(0.125);
                 System.out.println("Taxes: $"+tax3);
                 double net3=cpay-tax3;
                 System.out.println("Net pay: $"+net3);
                 break;
             case"p":
                 System.out.print("Enter pieces produced: ");
                 double price=may.nextDouble();
                 System.out.print("Enter pay per piece: ");
                 double perPrice=may.nextDouble();
                 double ppay=price*perPrice;
                 System.out.println("Grosspay: $"+ppay);
                 double tax4=ppay*(0.125);
                 System.out.println("Taxes: $"+tax4);
                 double net4=ppay-tax4;
                 System.out.println("Net pay: $"+net4);
                 break;

         }


         }

    }

