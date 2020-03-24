//Shengnan You
//112361646
//CSE 114
//HW#2
import java.util.Scanner;
public class PayrollReporter {
    public static void main(String[] args) {
        Scanner butter=new Scanner(System.in);
        System.out.print("Enter employee’s name: ");
        String name=butter.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hour=butter.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate=butter.nextDouble();
        double grossPay=payRate*hour;
        System.out.print("Enter federal tax withholding rate: ");
        double feTaxRate=butter.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
         double stTaxRate=butter.nextDouble();
         double feTax=grossPay*feTaxRate;
                 double stTax=grossPay*stTaxRate;
                 double deduct=feTax+stTax;
                 double net=grossPay-deduct;




        System.out.println();
        System.out.printf("Employee Name: %s%n",name);
        System.out.printf("Hours Worked: %.2f%n",hour);
        System.out.printf("Pay Rate: $%.2f%n",payRate);
        System.out.printf("Gross Pay: $%.2f%n",grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding("+"%.2f%%): $",feTaxRate*100);
        System.out.printf("%.2f\n",feTax);
        System.out.printf("  Federal Withholding("+"%.2f%%): $",stTaxRate*100);
        System.out.printf("%.2f\n",stTax);
        System.out.printf("  Total Deductions: $%.2f%n",deduct);
        System.out.printf("Net Pay: $%.2f",net);



    }
}
