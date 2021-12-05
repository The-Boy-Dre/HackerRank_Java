package ThirtyDaysofCode;


/*
Given a string, S , of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed characters as 
2 space-separated strings on a single line (see the Sample below for more detail). 

Input:
The first line contains an integer, T (the number of test cases).
Each line i of the T subsequent lines contain a string, S. 

Output:
print S's even-indexed characters, followed by a space, followed by S's odd-indexed characters. 
*/

import java.util.Scanner;
public class Day6{

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    

    for(int i = 0; i < T; i++){
      String S = scan.next();
      //char[] word = S.toCharArray(); // This is also an alternative way to check through a string
     

            for(int z = 0; z < S.length(); z++){
          //for(int z = 0; z < word.length; z++){ // This is also an alternative way to check through a string
              if(z % 2 == 0){
              System.out.print(S.charAt(z));
            //System.out.print(word[z]); // This is also an alternative way to check through a string
              }
            }
  
            System.out.print(" ");

            for(int x = 0; x < S.length(); x++){
              if(x % 2 != 0){
              System.out.print(S.charAt(x));
              }
            }
            System.out.println();
    }

   scan.close();      
  }
}

/*
Output:
2
Hacker
Hce akr
Rank
Rn ak
*/