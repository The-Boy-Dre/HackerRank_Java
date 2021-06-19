

/*
Given a string,s , and an integer, k , complete the function so that it finds the lexicographically
smallest and largest substrings of length k
*/

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
    

        String smallest = s.substring(0,k);
        String largest = "";
        for(int i = 0; i < s.length()-k+1;i++){ //This lines is what makes you be able to iterate through the entire string, character by character
            if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k); 
              if(s.substring(i,i+k).compareTo(smallest) >0) largest = s.substring(i,i+k);
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

/*
welcometojava 
3
ava
jav
*/