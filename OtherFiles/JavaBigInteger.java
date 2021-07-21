
/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't 
contain them in any ordinary data types like a long integer. Use the power of Java's 
BigInteger class and solve this problem.
*/

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
  
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    String one = scan.next();
    String two = scan.next();

    BigInteger digit = new BigInteger(one);
    BigInteger digit2 = new BigInteger(two);


    BigInteger sum1 = digit.add(digit2);
    BigInteger sum2 = digit.multiply(digit2);

    System.out.println(sum1);
    System.out.println(sum2);

    scan.close();
  }

}

//! BigInteger has no cap on its max size (as large as the RAM on the computer can hold).
/*
The java.math.BigInteger.add(BigInteger val) is used to calculate the Arithmetic sum of two BigIntegers. This method is used to find 
arithmetic addition of large numbers of range much greater than the range of biggest data type double of 
java without compromising with the precision of the result. 
*/