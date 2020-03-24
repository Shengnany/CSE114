//Shengnan You
//112361646
//CSE 114
//HW#4

import java.util.Arrays;

public class Homework4Methods {
    // part 1

    public static void rotateRight(int[][] matrix, int numCols) {
        if (numCols < 0) ;
        else {
            int[][] copy = new int[matrix.length][];

            for (int i = 0; i < matrix.length; i++) {
                copy[i] = new int[matrix[i].length];

                for (int j = 0; j < matrix[i].length; j++) {
                    copy[i][j] = matrix[i][j];
                }
            }


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][(j + numCols) % matrix[i].length] = copy[i][j];

                }

            }

        }
    }

    // part 2
    public static void printRuns(int[][] values, int runLength) {

        for (int i = 0; i < values.length; i++) {
            int k = 0;
            int j = 0;
            while (k < values[i].length &&j<values[i].length-1) {

                int count = 1;

                for (j = k; count < runLength && j < values[i].length - 1; j++) {
                    if (values[i][j] == values[i][j + 1]) count++;
                    else count = 1;
                }

                if (count == runLength) {
                    System.out.println("Row " + i + " columns " + (j - runLength + 1) + " - " + j);
                    k = j - runLength + 2;
                }

            }
        }

        for (int i = 0; i < values[i].length; i++) {
            int k = 0;
            int j = 0;
            while (k < values.length && j<values.length-1) {

                int count = 1;

                for (j = k;  j < values.length-1 && count < runLength ; j++) {
                    if (values[j][i] == values[j+1][i]) count++;
                    else count = 1;
                }

                if (count == runLength) {
                    System.out.println("Column " + i + " rows " + (j - runLength+1) + " - " + j);
                    k = j - runLength + 2;
                }
                else break;

            }
        }

    }


}