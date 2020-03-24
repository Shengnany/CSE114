//Shengnan You
//112361646
//CSE 114
//Lab 8
import java.util.Arrays;
public class Lab8 {
    public static void main(String[] args) {
        System.out.println("Part 1 outputs:");
        String[] s1 = {"Mike", "CSE", "Alice", "AMS", "Bob", "ECE", "Amber", "CSE",
                "Luke", "MAT", "Linda", "AMS", "David", "MEC"};
        System.out.println("Before: " + Arrays.toString(s1));
        sortStudentsWithMajor(s1);
        System.out.println("After:  " + Arrays.toString(s1));

        String[] s2 = {"Alice", "AMS", "Bob", "ECE", "Amber", "CSE", "Roger", "KOR", "Mike", "ESE",
                "Luke", "BIO", "Linda", "FRN", "David", "MEC", "Erin", "TSM"};
        System.out.println("Before: " + Arrays.toString(s2));
        sortStudentsWithMajor(s2);
        System.out.println("After:  " + Arrays.toString(s2));

        String[] s3 = {"Linda", "FRN", "Bob", "ECE",  "Alice", "AMS", "Amber", "CSE", "Roger", "KOR",
                "Mike", "ESE", "Xavier", "PHY", "Leo", "PHI", "Luke", "BIO", "David", "MEC", "Erin", "TSM"};
        System.out.println("Before: " + Arrays.toString(s3));
        sortStudentsWithMajor(s3);
        System.out.println("After:  " + Arrays.toString(s3));

        System.out.println("\nPart 2 outputs:");
        String[][] arr1 = {{"C", "D", "B", "A"},
                {"X", "Y", "Z", "Q"},
                {"1", "2", "3", "4"},};
        System.out.println("Before: " + Arrays.deepToString(arr1));
        swapColumns(arr1, 1, 3);
        System.out.println("After:  " + Arrays.deepToString(arr1));

        String[][] arr2 = {{"C", "D", "B", "E", "A"},
                {"X", "Y", "Z", "Q", "L"},
                {"1", "2", "3", "4", "M"},
                {"R", "S", "U", "W", "G",},
                {"P", "F", "D", "S", "A"}};
        System.out.println("Before: " + Arrays.deepToString(arr2));
        swapColumns(arr2, 0, 3);
        System.out.println("After:  " + Arrays.deepToString(arr2));

        System.out.println("Before: " + Arrays.deepToString(arr2));
        swapColumns(arr2, 5, 3);
        System.out.println("After:  " + Arrays.deepToString(arr2));

        System.out.println("Before: " + Arrays.deepToString(arr2));
        swapColumns(arr2, 1, -3);
        System.out.println("After:  " + Arrays.deepToString(arr2));

        System.out.println("\nPart 3 outputs:");
        String[][] stus1 = { {"Bob", "Alice", "Xavier", "Dana", "Chris"},
                {"AMS", "CSE", "BIO", "PHY", "ECE"},
                {"U2", "U4", "U1", "U2", "U3"}};
        System.out.println("Before: " + Arrays.deepToString(stus1));
        reverseSortStudents(stus1);
        System.out.println("After:  " + Arrays.deepToString(stus1));

        String[][] stus2 = { {"Bob", "Alice", "Xavier", "Dana", "Chris"},
                {"AMS", "CSE", "BIO", "PHY", "ECE"},
                {"U2", "U4", "U1", "U2", "U3"},
                {"NY", "NJ", "CT", "MA", "NC"}};
        System.out.println("Before: " + Arrays.deepToString(stus2));
        reverseSortStudents(stus2);
        System.out.println("After:  " + Arrays.deepToString(stus2));

        String[][] stus3 = { {"Susan", "Alice", "Dana", "Mike"},
                {"AMS", "CSE", "PHY", "ECE"},
                {"U2", "U4",  "U2", "U3"},
                {"NJ", "CT", "MA", "NC"},
                {"A-", "B+", "C+", "B-"}};
        System.out.println("Before: " + Arrays.deepToString(stus3));
        reverseSortStudents(stus3);
        System.out.println("After:  " + Arrays.deepToString(stus3));
    }

    // Part 1
    public static void sortStudentsWithMajor(String[] students) {
        boolean x;
        String temp1;
        String temp2;

do{
    x=false;

        for (int i = 0; i < students.length - 3; i = i + 2) {
            if (students[i].compareTo(students[i + 2]) > 0) {
                temp1 = students[i];
                students[i] = students[i + 2];
                students[i + 2] = temp1;
                temp2 = students[i + 1];
                students[i + 1] = students[i + 3];
                students[i + 3] = temp2;
            }
        }

    } while(x);
}





    // Part 2
    public static void swapColumns(String[][] array, int col1, int col2) {
    String temp;
  if(!(col1<0||col1>=array[0].length||col2<0||col2>=array[0].length)){
      for(int i=0;i<array.length;i++){
          temp=array[i][col1];
          array[i][col1]=array[i][col2];
          array[i][col2]=temp;
      }
  }


    }

    // Part 3
    public static void reverseSortStudents(String[][] students) {

        for (int i = 0; i < students[0].length -1; i++) {
// Find the minimum in the list[i..list.length-1]
            String currentMax = students[0][i];
            int currentMaxIndex = i;
            for (int j = i + 1; j < students[0].length; j++) {
                if (currentMax .compareTo( students[0][j])<0) {
                  currentMax=students[0][j];
                 currentMaxIndex =j;
                }
            }
// Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMaxIndex != i) {
                swapColumns(students,i,currentMaxIndex);


            }
        }

        }
    }


