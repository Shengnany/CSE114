//Shengnan You
//112361646
//CSE 114
//HW#1
import java.util.Scanner;
public class GreekMoney {
    public static void main(String[] args) {
        int total,a,b,c,d,e,f;
        Scanner num= new Scanner(System.in);
        System.out.print("Enter number of oboloi: ");
        total=num.nextInt();
        System.out.println("That number of oboloi is equal to:");
        a= total/25200;
        if(a==1||a==0){
            System.out.println(a+" talent");
        }else {
            System.out.println(a + " talents");
        }
        b=total%25200;
        c=b/420;
        if(c==1||c==0){
            System.out.println(c+" mina ");
        }else {
            System.out.println(c+ " minae ");
        }
        d=b%420;
        e=d/6;
        if (e==1||e==0){
            System.out.println(e+" drachma ");
        }else {
            System.out.println(e+ " drachmae ");
        }
        f=e%6;//d%6
        if(f==1||f==0){
            System.out.println(f+" obolus");
        }else {
            System.out.println(f+ " oboloi");
        }

    }
}
