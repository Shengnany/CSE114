//Shengnan You
//112361646
//CSE 114
//Lab#12
import java.io.File;
import java.util.Scanner;

public class TextFileStats {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String s = input.nextLine();
        File x = new File(s);

            int characters = 0;
            int lines = 0;
            int words = 0;
            try(Scanner file=new Scanner(x)){
                while(file.hasNext()){
                    String a=file.nextLine();
                    lines++;
                }
                }
            catch (Exception e){
                System.out.println("Wrong file name!");
            }
            try(Scanner file=new Scanner(x)){
                while(file.hasNext()){
                    String a=file.next();
                    words++;
                }
            }
            catch (Exception e){
                System.out.println("Wrong file name!");
            }

            try(Scanner file=new Scanner(x)) {
                while (file.hasNext()) {
                    String a = file.next();
                    characters += a.length();
                    characters++;
                }
            }
            catch (Exception e){
                System.out.println("Wrong file name!");
            }



            System.out.println(characters+" characters");
        System.out.println(words+" words");
        System.out.println(lines+" lines");
    }

    }


