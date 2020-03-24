import java.util.Scanner;

public class draft {
    public static void main(String[] args) {
        Scanner butter=new Scanner(System.in);
        System.out.print("Enter an integer to be a limit of the pattern:" );
        int lm=butter.nextInt();
        int i,j,k;


        System.out.println("Pattern A:");
        for(i=1;i<=lm;i++){
            for (j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();




        System.out.println("Pattern B:");
        for(i=lm;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Pattern C:");
        for(i=1;i<=lm;i++){
            for(j=1;j<=lm-i;j++){
                System.out.print("  ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern D:");
        for(i=lm;i>=1;i--){
            for(j=1;j<=lm-i;j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
        System.out.println();






    }

}
