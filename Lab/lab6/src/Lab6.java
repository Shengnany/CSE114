// Shengnan You
// 112361646
// CSE114
// Lab6

import java.util.Arrays;

public class Lab6 {
    public static void main(String[] args) {
        System.out.println("Part 1 outputs:");
        System.out.println(Arrays.toString(
                interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6})));
        System.out.println(Arrays.toString(
                interleaveArrays(new int[]{4,3,2,1}, new int[]{5,6,7,8})));
        System.out.println(Arrays.toString(
                interleaveArrays(new int[]{1,5,7,9,0}, new int[]{3,4,6,8,2})));

        System.out.println("\nPart 2 outputs:");
        System.out.println(frog(44, new String[]{"eat", "play"}));
        System.out.println(frog(16, new String[]{"play", "eat", "work"}));
        System.out.println(frog(27, new String[]{"play", "eat", "read", "play", "read", "read", "work", "read", "eat", "eat", "work", "work", "work"}));
        System.out.println(frog(41, new String[]{"play", "work", "eat", "play"}));
        System.out.println(frog(23, new String[]{"work", "play", "eat", "read", "work", "read", "play"}));
        System.out.println(frog(50, new String[]{"read", "eat", "eat", "read", "work", "read", "work"}));
        System.out.println(frog(10, new String[]{"eat", "read", "work", "eat", "read", "read", "read", "work"}));
        System.out.println(frog(38, new String[]{"play", "eat", "work", "play", "eat", "work", "read", "play", "play", "work", "read", "work"}));
        System.out.println(frog(7, new String[]{"work", "play", "play", "read", "work"}));
        System.out.println(frog(24, new String[]{"work", "play", "eat"}));
    }

    // Part 1
    public static int[] interleaveArrays(int[] nums1, int[] nums2) {
       int n=nums1.length+nums2.length;
        int [] interleaveArray=new int [n];
        for(int i=0;i<nums1.length;i++){
            interleaveArray[2*i]=nums1[i];
            interleaveArray[2*i+1]=nums2[i];
            }





        return interleaveArray;  // replace with your own return statement

    }

    // Part 2
    public static int frog(int startingMood, String[] actions) {
        int mood=startingMood;

        for(int i=0;i< actions.length;i++)
        {
            if ( actions[i]=="play") mood+=3;
            else if ( actions[i]=="eat"&& mood>=0.5*startingMood ) mood+=1;
            else if (actions[i]=="eat"&& mood<0.5*startingMood)  mood-=2;
           else if (actions[i]=="read"&& mood>=0.75*startingMood)  mood-=3;
            else if(actions[i]=="read"&& mood<0.75*startingMood)  mood-=4;
            else if(actions[i]=="work")  mood-=5;
            mood--;

        }





        if(mood<=0)
            return 0;
        else return mood; // replace with your own return statement
    }
}