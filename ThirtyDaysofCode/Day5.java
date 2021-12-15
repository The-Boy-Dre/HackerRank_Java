package ThirtyDaysofCode;

import java.io.*;

/*
Given an integer, n, print its first 10 multiples. Each multiple n x i(where 1 <= i <= 10) 
should be printed on a new line in the form: n x i = result.
*/

public class Day5 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for(int i = 0; i < 1; i++){
          for(int x = 1; x <= 10; x++){
            System.out.println(n+" x "+x+" = "+ n*x);
          }
        }

        bufferedReader.close();
    }
}
