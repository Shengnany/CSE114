//Shengnan You
//112361646
//CSE 114
//Hw#7
import java.util.ArrayList;

public class Homework7Methods {
    // part 1
    public static int findTimes10(int[] nums) {
        if (nums.length == 1) return -9;
        int[] num = new int[nums.length - 1];
        System.arraycopy(nums, 1, num, 0, num.length);
        if (nums[1] == 10 * nums[0]) return nums.length - num.length - 1;
        else return nums.length - num.length + findTimes10(num);

    }

    // part 2
    public static void replaceMult5(int[] nums, int newVal) {
        helperPart2(nums, newVal, 0);

    }

    public static void helperPart2(int[] nums, int newVal, int low) {
        if (!(low == nums.length - 1)) {
            if (nums[low] % 5 == 0) nums[low] = newVal;
            low++;
            helperPart2(nums, newVal, low);
        }

    }

    // part 3
    public static ArrayList<int[]> permuteArray(int[] array) {
        ArrayList<int[]> result = new ArrayList<>();
permutations(array,0,result);
       return result;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Recursive function to generate all permutations of a String
   private static void permutations(int[] a, int currentIndex,ArrayList<int []>result) {


        if (currentIndex == a.length - 1) {
            int[] b=new int [a.length];
            for (int i=0;i<b.length;i++) {
                b[i]=a[i];
            }
result.add(b);
        } else {

            for (int i = currentIndex; i < a.length; i++) {
                swap(a, currentIndex, i);
                permutations(a, currentIndex + 1,result);
                swap(a, currentIndex, i);

            }
   }
    }

    // part 4
    public static String[] mobius(String s1, String s2) {
     String[] str=new String[s1.length()+s2.length()];
     String s=s1+s2;
     str[0]=s;
         return helper4(s,1,str);
    }


    public static String[] helper4(String s,int index, String[] str){


        if(index<str.length){
            s=s.substring(1)+s.charAt(0);
            str[index]=s;
        return helper4(s,index+1,str);
        }
        else return str;
    }

    // part 5

    public static int teddy(int initial, int goal, int increment) {
        int mistake = -1;
        for (int i = 0; i < 11; i++) {
            if (teddyHelper(initial, goal,increment ,i)) {
                mistake = i;
           break;
            }
        }
        return mistake;
    }
        public static boolean teddyHelper(int initial, int goal,int increment, int n){


            if (initial == goal)
                return true;
            else if (n == 0)
                return false;
            else if (teddyHelper(initial+increment, goal, increment, n-1))
                return true;
            else if (teddyHelper(initial-increment, goal, increment, n-1))
                return true;
            else if ((initial % 2 == 0) && teddyHelper(initial/2, goal, increment, n-1))
                return true;
            else if ((initial % 2 == 0) && teddyHelper(initial + (initial/2), goal, increment, n-1))
                return true;
            else
                return false;



        }




}
