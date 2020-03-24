//Shengnan You
//112361646
//CSE 114
//Lab#14
public class Lab14 {
    public static void main(String[] args) {
        System.out.println("Part I Output:");
        int value = 12345;
        System.out.print("reverseDisplay(" + value + ") = ");
        reverseDisplay(value);
        System.out.println();
        value = 4;
        System.out.print("reverseDisplay(" + value + ") = ");
        reverseDisplay(value);
        System.out.println();
        value = 92;
        System.out.print("reverseDisplay(" + value + ") = ");
        reverseDisplay(value);
        System.out.println();

        System.out.println("\nPart II Output:");
        int n = 5;
        System.out.println("hailstone(" + n + ") = " + hailstone(n));
        n = 6;
        System.out.println("hailstone(" + n + ") = " + hailstone(n));
        n = 8;
        System.out.println("hailstone(" + n + ") = " + hailstone(n));

        System.out.println("\nPart III Output:");
        String str = "abraCAdabRA";
        System.out.println("count(\"" + str + "\") = " + count(str));
        str = "no uppercase letters 2019";
        System.out.println("count(\"" + str + "\") = " + count(str));
        str = "ALLUPPERCASE";
        System.out.println("count(\"" + str + "\") = " + count(str));
    }

    // Part I
    public static void reverseDisplay(int value) {

        System.out.print(value%10);
        if((value/10)>0) reverseDisplay(value/10);
    }

    // Part II
    public static int hailstone(int n) {
        if (n ==1)
            return 1;
        else {
            if (n%2==0)
                return 1+hailstone(n/2);
            else
               return 1 + hailstone(3*n+1);
        }
    }



    // Part III
    public static int count(String str) {
     return count(str,str.length()-1);
    }

    public static int count(String str, int high) {
        char a=str.charAt(high);
        high--;
        if(high>=0) {
            if (Character.isUpperCase(a)) return 1 + count(str, high);
            else return count(str, high);
        }
        else return 0;
    }
}