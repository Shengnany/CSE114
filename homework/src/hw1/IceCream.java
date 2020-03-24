//Shengnan You
//112361646
//CSE 114
//HW#1
import java.util.Scanner;
public class IceCream {
    public static void main(String[] args) {
        Double v1,v2,v;
        Scanner param= new Scanner(System.in);
        Double radius,height;
        System.out.print("Enter radius of ice cream and cone (in inches):");
        radius = param.nextDouble();
        System.out.print("Enter height of cone (in inches):");
        height = param.nextDouble();
        v1= ((2)*(Math.PI)*(Math.pow(radius,3)))/3;
        v2=((Math.PI)*(Math.pow(radius,2))*(height))/3;
        v=v1+v2;
        System.out.println("Volume of ice cream (in cubic inches):"+v);
    }
}
