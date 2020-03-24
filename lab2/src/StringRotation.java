//Shengnan You
//112361646
//CSE 114
//Lab 3
import java.util.Scanner;

public class StringRotation{
    public static void main(String[] args) {
        Scanner butter= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String ori = butter.nextLine();
        System.out.print("Enter a rotation amount:");
        int ro = butter.nextInt();
        int len= ori.length();
        if(ro>0){
            System.out.print(ori.substring(ro,len));
            System.out.print(ori.substring(0,ro));}
        else

            System.out.print(ori.substring(len+ro,len)+ori.substring(0,len+ro));

    }

}


