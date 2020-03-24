package hw3;

//Shengnan You
//112361646
//CSE 114
//HW#3
public class Homework3Methods {
    // part 2
    public static String eliminateDuplicates(String str) {
        StringBuffer result = new StringBuffer(str);
        for (int i = 0; i < result.length(); i++) {
            for (int j = i + 1; j < result.length(); j++) {
                if (result.charAt(i) == result.charAt(j)) {
                    result.deleteCharAt(j);
                    j--;
                }
            }
        }
        String output = new String(result);
        return output;
    }

    // part 3
    public static String getDigits(String phoneNumber) {

        StringBuffer result = new StringBuffer(phoneNumber.toLowerCase());

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '-') {
                result.deleteCharAt(i);
                i--;
            } else if (result.charAt(i) == 'a' || result.charAt(i) == 'b' || result.charAt(i) == 'c')
                result.replace(i, i + 1, "2");
            else if (result.charAt(i) == 'd' || result.charAt(i) == 'e' || result.charAt(i) == 'f')
                result.replace(i, i + 1, "3");
            else if (result.charAt(i) == 'g' || result.charAt(i) == 'h' || result.charAt(i) == 'i')
                result.replace(i, i + 1, "4");
            else if (result.charAt(i) == 'j' || result.charAt(i) == 'k' || result.charAt(i) == 'l')
                result.replace(i, i + 1, "5");
            else if (result.charAt(i) == 'm' || result.charAt(i) == 'n' || result.charAt(i) == 'o')
                result.replace(i, i + 1, "6");
            else if (result.charAt(i) == 'p' || result.charAt(i) == 'q' || result.charAt(i) == 'r' || result.charAt(i) == 's')
                result.replace(i, i + 1, "7");
            else if (result.charAt(i) == 't' || result.charAt(i) == 'u' || result.charAt(i) == 'v')
                result.replace(i, i + 1, "8");
            else if (result.charAt(i) == 'w' || result.charAt(i) == 'x' || result.charAt(i) == 'y'|| result.charAt(i) == 'z')
                result.replace(i, i + 1, "9");
        }

        return result.toString();
    }

    // part 4
    public static int lowestBasePalindrome(int num) {

        int base = 1;
        boolean check = true;

        do {
            base++;
            int length = 0;
            int temp1 = num;
            int temp2 = num;
            while (temp1 != 0) {
                length++;
                temp1 /= base;
            }
            int[] result = new int[length];

            for (int i = length - 1; i >= 0; i--) {
                result[i] = temp2 % base;
                temp2 /= base;
            }

            for (int i = 0; i  <= length / 2; i++) {
                if (result[i] == result[length - 1 - i]) check = true;
                else {
                    check = false;
                    break;
                }

            }


        } while (!check);

        return base;
    }

    // part 5
    public static int[] interleaveArrays(int[] array1, int[] array2, int stride, int maxElements) {
        if (stride <= 0 || maxElements <= 0)
            return null;
        else {
            int n = array1.length + array2.length;
            int length = n < maxElements ? n : maxElements;
            //确定array
            // i<=stride
            int[] result = new int[length];
            int minLength = Math.min(array1.length, array2.length);
            int j = 0;


            int i = 0;
            while (i < minLength) {

                    for (int counter = 0; counter < Math.min(stride,array1.length); counter++) {
                        if (i < minLength && j < length)
                            result[j++] = array1[i++];
                    }
                    if (j < length) j = j + stride ;
                    else break;
                }

            i = 0;
            j = minLength < stride ? minLength : stride;

            while (i < minLength) {
                for (int counter = 0; counter < Math.min(stride,array1.length); counter++) {
                    if (i < minLength && j < length)
                        result[j++] = array2[i++];


                }

                if (j < length) j = j + stride  ;
                else break;
            }





            int k;
            j=2*minLength;
            if (array1.length < array2.length) {
                for (k = minLength; k < array2.length; k++) {
                    if (j < length) result[j++] = array2[k];
                }
            } else {
                for (k = minLength; k < array1.length; k++) {
                    if (j < length) result[j++] = array1[k];

                }
            }
            return result;

        }
    }


    }





