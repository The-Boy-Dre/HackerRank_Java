

/*
Given a string,s , and two indices, start and end, print a substring consisting of all characters in the inclusive 
range from start to end -1 . You'll find the String class' substring method helpful in completing this challenge. 
*/

import java.util.Scanner;
public class JavaSubstring{

  public static void main(String[] args) {
    
    Scanner scan =new Scanner(System.in);
    String S = scan.next();
    int start = scan.nextInt();
    int end  = scan.nextInt();

    System.out.println(S.substring(start, end));

    scan.close();
  }
}

/*
HelloWorld
3
7
loWo
*/