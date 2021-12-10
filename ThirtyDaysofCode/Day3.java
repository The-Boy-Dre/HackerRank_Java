package ThirtyDaysofCode;


/*
Given an integer,n, perform the following conditional actions:

    If n is odd, print Weird
    If n is even and in the inclusive range of 2 to 5, print Not Weird
    If n is even and in the inclusive range of 6 to 20, print Weird
    If n is even and greater than 20, print Not Weird
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;
public class Day3 {
  public static void main(String[] args) {
    
     Scanner scan = new Scanner(System.in);
     
     int N = scan.nextInt();

     if(N % 2 != 0){
      System.out.println("Weird");
        } else if(N % 2 == 0 && N >= 2 && N <= 5){
          System.out.println("Not Weird");
          } else if(N % 2 == 0 && N >= 6 && N <= 20){
            System.out.println("Weird");
            } else if(N % 2 == 0 && N > 20){
              System.out.println("Not Weird");
            }
     
     scan.close();
  }
}





class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        
        if(N % 2 != 0){
            System.out.println("Weird");
            } else if((N % 2 == 0) && N >= 2 && N <= 5){
                System.out.println("Not Weird");
                 } else if((N % 2 == 0) && N >= 6 && N <= 20){
                      System.out.println("Weird");
                    } else if(N % 2 == 0 && N > 20){
                        System.out.println("Not Weird");
                        }
               
            
    bufferedReader.close();
 }
}