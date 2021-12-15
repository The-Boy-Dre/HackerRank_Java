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
import java.io.*;


public class Day6 {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(buff.readLine());

        for(int i = 1; i <= T; i++){      
          String S = buff.readLine();
          int nmb = S.length();
          
            for(int x = 0; x < nmb; x++){
              if(x % 2 == 0){
                System.out.print(S.charAt(x));
                }
            }
            System.out.print(" ");

            for(int y = 0; y < nmb; y++){
              if(y % 2 != 0){
                System.out.print(S.charAt(y));
                }
            }
          System.out.println();
        }
        buff.close();

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