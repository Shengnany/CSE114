//Shengnan You
//112361646
//CSE 114
//hw#6
import java.io.*;
import java.util.*;

public class ReformatCode{
    public static void main(String[] args) throws Exception{


        File sourceFile= new File(args[0]);
        if(args.length != 2){
            System.out.println("invalid");
            return;
        }

        if(!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist"); System.exit(1);
        }
        File targetFile=new File(args[1]);
        if(targetFile.exists()){
            System.out.println("Target file " + args[1] + " already exists"); System.exit(1);
        }

        try(     Scanner input=new Scanner(sourceFile);
                PrintWriter output=new PrintWriter(targetFile);
                )
        {
            String a=input.nextLine();
            while(input.hasNext()){
                String b=input.nextLine();
                if((b.trim()).charAt(0)=='{') {
                    output.println(a+'{');
                    a=input.nextLine();
                }
                else {
                    output.println(a);
                     a=b;
                     if(!input.hasNext()) output.println(b);
                }
        }
        }
    }

}
