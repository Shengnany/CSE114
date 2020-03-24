//Shengnan You
//112361646
//CSE 114
//Lab#11
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Variance {
    public static double variance (ArrayList<Double>list){
        double sum=0;
        for(int i=0;i<list.size();i++)  sum+=list.get(i);
        double mean=sum/list.size();
        double result=0;
        for(int i=0;i<list.size();i++) result+=(list.get(i)-mean)*(list.get(i)-mean);
        result=result/list.size();
        return result;
    }


    public  static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Double> numList=new ArrayList<>();
        System.out.print("Enter a list of numbers: ");
        boolean continueInput=true;
        double num=0;
        do {
            try {
                 num = input.nextDouble();
                if(num!=-1) numList.add(num);
            } catch (InputMismatchException ex) {
                System.out.println(
                        "Incorrect input occurred ");
                input.next();
            }
        } while(num!=-1);
        System.out.println("The variance is : "+variance(numList));
        }
    }

