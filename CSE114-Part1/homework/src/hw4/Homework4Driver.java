//Shengnan You
//112361646
//CSE 114
//HW#4


import java.util.Arrays;

public class Homework4Driver {
    public static void main(String[] args) {
        System.out.println("\nPart 1 outputs:");
        int[][] nums2D = new int[][]{ {1,2,3}, {-1,-2,-3,-4,-5}, {6,7,8,9}, {10, 11} };
        Homework4Methods.rotateRight(nums2D, 2);
        System.out.println(Arrays.deepToString(nums2D));
        nums2D = new int[][]{ {1,2,3}, {-1,-2,-3,-4,-5}, {6,7,8,9}, {10, 11} };
        Homework4Methods.rotateRight(nums2D, 7);
        System.out.println(Arrays.deepToString(nums2D));
        nums2D = new int[][]{ {1,2,3}, {-1,-2,-3,-4,-5}, {6,7,8,9}, {10, 11} };
        Homework4Methods.rotateRight(nums2D, -1);
        System.out.println(Arrays.deepToString(nums2D));

        System.out.println("\nPart 2 outputs:");
        nums2D = new int[][]{
                {5, 5, 0, 5, 2},
                {1, 2, 2, 2, 2},
                {2, 4, 2, 2, 2},
                {2, 2, 2, 2, 2},
                {3, 3, 2, 2, 2},
                {4, 4, 2, 2, 0},
                {4, 2, 2, 2, 8}};
        Homework4Methods.printRuns(nums2D, 4);
        System.out.println();
        Homework4Methods.printRuns(nums2D, 5);
        System.out.println();
        Homework4Methods.printRuns(nums2D, 6);
        System.out.println();
        Homework4Methods.printRuns(nums2D, 7);
    }
}