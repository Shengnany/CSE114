import java.io.File;
import java.util.Scanner;
public class ProcessScores {
        public static void main(String[] args) throws Exception{
            Scanner input=new Scanner(System.in);
            System.out.print("Enter file name: ");
            String s=input.nextLine();
            File x = new File(s);
           double sum=0;
            int count=0;
            try ( Scanner file = new Scanner(x)){
                while(file.hasNext()){
                    sum+=file.nextInt();
                    count++;
                }
            }
            catch (Exception e){
                System.out.println("No file exists!");
            }
            System.out.println("Total is: "+sum);
            System.out.println("Average is: "+(sum/count));

        }
    }

