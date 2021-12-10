package ThirtyDaysofCode;



/*
Declare 3 variables: one of type int, one of type double, and one of type String.
Read lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your 3 variables.
Use the + operator to perform the following operations:

1. Print the sum of i plus your int variable on a new line.
2. Print the sum of d plus your double variable to a scale of one decimal place on a new line.
3. Concatenate s with the string you read as input and print the result on a new line. 
*/
import java.io.*;
import java.util.Scanner;

public class Day1 {
	
  public static void main(String[] args) {
      int i = 4;
      double d = 4.0;
      String s = "HackerRank ";
  
      Scanner scan = new Scanner(System.in);

      int nmb = scan.nextInt();
      double deci = scan.nextDouble();
      scan.nextLine();       // This is what clears the cache when accepting user input
      String word = scan.nextLine();

      System.out.println(i + nmb);
      System.out.println(d + deci);
      System.out.println(s + word);

      scan.close();
  }
}


class hmm {
	
  public static void main(String[] args) throws IOException {
      int i = 4;
      double d = 4.0;
      String s = "HackerRank ";
  

      BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

      int nmb = Integer.parseInt(scan.readLine());
      double deci = Double.parseDouble(scan.readLine());
      String word =  scan.readLine();

      System.out.println(i + nmb);
      System.out.println(d + deci);
      System.out.println(s + word);

      scan.close();
  }
}