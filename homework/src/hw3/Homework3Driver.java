package hw3;//Shengnan You
//112361646
//CSE 114
//HW#3
import java.util.Arrays;

public class Homework3Driver {
    public static void main(String[] args) {
        // Below are the test cases from the homework assignment PDF for Parts 2-5.
        // You should add your own additional code to check the return values
        // to see if they are correct.

        System.out.println("Part 2 outputs:");
        String result;
        result = Homework3Methods.eliminateDuplicates("abracadabra");
        System.out.println(result);
        result = Homework3Methods.eliminateDuplicates("What's a Seawolf? I'm a Seawolf!");
        System.out.println(result);
        result = Homework3Methods.eliminateDuplicates("Stony Brook University");
        System.out.println(result);
        result = Homework3Methods.eliminateDuplicates("AaBbCcDd");
        System.out.println(result);
        result = Homework3Methods.eliminateDuplicates("");
        System.out.println(result); // should be empty string

        System.out.println("\nPart 3 outputs:");
        result = Homework3Methods.getDigits("1-800-Flowers");
        System.out.println(result);
        result = Homework3Methods.getDigits("1800FLOWERS");
        System.out.println(result);
        result = Homework3Methods.getDigits("1-CSE-114-JAVA");
        System.out.println(result);
        result = Homework3Methods.getDigits("Seawolf-SBU-1");
        System.out.println(result);

        int base;
        System.out.println("\nPart 4 outputs:");
        base = Homework3Methods.lowestBasePalindrome(100);
        System.out.println(base);
        base = Homework3Methods.lowestBasePalindrome(917);
        System.out.println(base);
        base = Homework3Methods.lowestBasePalindrome(977);
        System.out.println(base);
        base = Homework3Methods.lowestBasePalindrome(271928172);
        System.out.println(base);

        int[] nums;
        System.out.println("\nPart 5 outputs:");
        nums = Homework3Methods.interleaveArrays(new int[]{2,2,5,4},new int[]{6,2,1,8,4,4},2,10);
        System.out.println(Arrays.toString(nums));
        nums = Homework3Methods.interleaveArrays(new int[]{10,9,8},new int[]{1,2,3},5,20);
        System.out.println(Arrays.toString(nums));
        nums = Homework3Methods.interleaveArrays(new int[]{2,5,1,4}, new int[]{10,5,2},1,8);
        System.out.println(Arrays.toString(nums));
        nums = Homework3Methods.interleaveArrays(new int[]{2,4,6,8},new int[]{9,7,5,3,1},0,6);
        System.out.println(Arrays.toString(nums));
        nums = Homework3Methods.interleaveArrays(new int[]{1,2},new int[]{2,3,4,5},4,-3);
        System.out.println(Arrays.toString(nums));
    }
}