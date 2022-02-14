package ThirtyDaysofCode;

import java.util.*;


/*
Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of 
consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript. 
*/


public class Day10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        // convert to binary and split into strings of consecutive ones
        String[] groupings = Integer.toBinaryString(n).split("0"); // Method to convert integers to Binary in a array format
        int max = 0;
        for(String s : groupings){
            if(max < s.length()){ // This iterates through the array and see if any other object has a length more than the current max
                max = s.length();
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(groupings));


        in.close();
    }
}

/* 
Output:
125
5
*/

