package LanguageProficiency;


/*
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. 
For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
*/


import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {
    
    static boolean isAnagram(String s1, String s2) {
        
        if(s1.length() != s2.length()) return false;
        
        char[] a = s1.toUpperCase().toCharArray();
        char[] b = s2.toUpperCase().toCharArray();
        
        Arrays.sort(a); // For sort to work here, it has to be an array as an argument so we convert the Strings first
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true; // There has to be a return statement outside the 
        
    }
    
    public static void main(String[] args) {

        System.out.println("Enter two words that you think might be Anagrams:");
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}







