package LanguageProficiency;

/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 We define a token to be one or more consecutive English alphabetic letters. 
Then, print the number of tokens, followed by each token on a new line.
*/

import java.util.Scanner;
public class StringTokens {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine(); // nextLine is sued because the input can be a sentence too, not just a word
    scan.close();

    if (s.trim().length()==0 || s.trim().length()>400000)
    {
        System.out.println(0);
        return;
    }
    
        String notWanted = "[ .@_',?!]+"; // This filters out any unwanted things in sentences
        String[] str = s.trim().split(notWanted);
        

        System.out.println(str.length);
        for(int i = 0; i < str.length; i++){
          System.out.println(str[i]);
          }
    

    
}

}
