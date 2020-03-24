import java.util.List;
import java.util.ArrayList;
public class r {
    public static ArrayList<int[]> permute(int[] nums) {
        ArrayList<int[]> result = new ArrayList<>();
        helper(0, nums, result);
        return result;
    }

    private static void helper(int start, int[] nums, ArrayList<int[]> result) {
        if(start==nums.length-1){
            ArrayList<Integer> list = new ArrayList<>();
            for(int num: nums){
                list.add(num);
            }
     return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            helper(start + 1, nums, result);
            swap(nums, i, start);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println("\nPart 3:");
        int[] nums = new int[]{4, 7, 1, 2};
        ArrayList<int[]> perms = permute(nums);
        System.out.println("permuteArray({4, 7, 1, 2}):");
        for (int[] array: perms) {
            for (int i = 0; i < array.length; i++)
                System.out.print(array[i] + " ");
            System.out.println();
        }
    }
}