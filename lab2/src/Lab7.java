//Shengnan You
//112361646
//CSE 114
//Lab#7
import java.util.Arrays;

public class Lab7 {
    public static void main(String[] args) {
        System.out.println("Part 1 outputs:");
        System.out.println(Arrays.deepToString(
                cropArray(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},
                        {13, 14, 15, 16}}, 1, 3, 0, 1)));
        System.out.println(Arrays.deepToString(
                cropArray(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},
                        {13, 14, 15, 16}}, 1, 1, 2, 2)));
        System.out.println(Arrays.deepToString(
                cropArray(new int[][]{
                                {1, 2, 3, 4, 5, 6, 7, 8},
                                {9, 10, 11, 12, 13, 14, 15, 16},
                                {17, 18, 19, 20, 21, 22, 23, 24},
                                {25, 26, 27, 28, 29, 30, 31, 32}},
                        0, 3, 2, 6)));

        System.out.println("\nPart 2 outputs:");
        System.out.println(Arrays.toString(
                quizAverages(new double[][]{{8, 2, 13, 4}, {5, 16, 8, 15},
                        {9, 10, 11, 12}, {13, 14, 15, 16}})));
        System.out.println(Arrays.toString(
                quizAverages(new double[][]{{2, 13, 4},
                        {5, 16, 15},
                        {9, 10, 12},
                        {13, 14, 6},
                        {2, 4, 6}})));
        System.out.println(Arrays.toString(
                quizAverages(new double[][]{
                        {11, 2, 13, 4, 5, 6, 7, 18},
                        {9, 10, 21, 12, 13, 24, 15, 16},
                        {17, 18, 19, 20, 11, 12, 23, 14},
                        {25, 16, 17, 28, 29, 30, 21, 22}})));
    }

    // Part 1
    public static int[][] cropArray(int[][] array, int startRow, int endRow,
              int startCol, int endCol) {


        if(startRow<0|| endRow<0||startCol<0|| endCol<0||startRow>endRow||startCol>endCol||endRow>array.length||endCol>array.length||endRow>array[1].length
        ) {
            int[][] array1 = new int[array.length][array[1].length];
            System.arraycopy(array, 0, array1, 0, array.length);
            return array1;
        }
        int [][] output = new int [endRow-startRow+1][endCol-startCol+1];
        for (int i=startRow,m=0;i<=endRow;i++,m++){
       for(int j=startCol,k=0;j<=endCol;j++,k++){
        output[m][k]=array[i][j];

       }
        }



        return output;
    }

    // Part 2
    public static double[] quizAverages(double[][] scores) {

        double[] quizAverages=new double[scores[1].length];
        for (int i = 0; i < quizAverages.length; i++)  {
            for(int j=0;j<scores.length;j++) {
                quizAverages[i]+=scores[j][i];
            }


        }
        for (int i = 0; i < quizAverages.length; i++){
            quizAverages[i]/=scores.length;

        }

        return quizAverages;
    }
}