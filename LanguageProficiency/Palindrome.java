



//Given a string A, print Yes if it is a palindrome, print No otherwise. 

import java.util.Scanner;
public class Palindrome{


    static boolean isPalindrome(String str){

        int i = 0;                    // i is a Pointer pointing to the beginning.
        int j = str.length() - 1;   // This starts the length of the string at the highest number then works it way down with the subtraction of one in a loop
        while(i < j){               // when the while loop hit's the 0 index it will stop looping

            if(str.charAt(i) != str.charAt(j)){  // i will increase until it reaches the max index size of the string, while j will decrease the exact same amount of time because it's working
               return false;                     // off variable i and that will put it at the first char index of the string to compare if it is not equal in reverse as it was when it was entered 
            }  
        i++; // Increments the variable i 
        j--; // while decrementing the other at the same time
        }

        return true; // returns true only if the string goes through the while loop and a match is found
    }


    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(A.length() <= 50){
                if(isPalindrome(A)){
                    System.out.println("Yes");
                } else{
                    System.out.println("No");
                }
        }else{
            System.out.println("Sorry too many characters");
        }

        sc.close();
    }
}

/*
abba
Yes
*/
