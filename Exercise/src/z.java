import java.util.Arrays;
import java.util.Scanner;

public class z {
    public static void main(String[] args) {


          int[][] matrix={ {1,2,3}, {-1,-2,-3,-4,-5}, {6,7,8,9}, {10, 11} };

                int[][] copy = new int[matrix.length][];

                for (int i = 0; i < matrix.length; i++) {
                    copy[i] = new int[matrix[i].length];

                    for (int j = 0; j < matrix[i].length; j++) {
                        copy[i][j] = matrix[i][j];
                    }
                }
                System.out.println(Arrays.deepToString(copy));
    }

}