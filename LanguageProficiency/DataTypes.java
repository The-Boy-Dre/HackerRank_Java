package LanguageProficiency;


/*
  Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

  A byte is an 8-bit signed integer.
  A short is a 16-bit signed integer.
  An int is a 32-bit signed integer.
  A long is a 64-bit signed integer.

  Given an input integer, you must determine which primitive data types are capable of properly storing that input.
  To get you started, a portion of the solution is provided for you in the editor.
*/



import java.util.*;

class DataTypes{
    public static void main(String []args){
    

        System.out.print("Enter the amount of test cases you would wish to try: ");

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){ //Beginning of for loop
            System.out.print("Enter a primitive digit to find it's appropriate data type: ");

            try{
            
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");

                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE){
                  System.out.println("* byte");
                    } if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE){
                      System.out.println("* short");
                      } if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
                        System.out.println("* int");
                        } if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){
                          System.out.println("* long");
                          }

            }catch(Exception e){
             System.out.println(sc.next()+" can't be fitted anywhere.");
            }
             
            
        } //End of for loop

        sc.close();
    }
}

/*
  Enter the amount of test cases you would wish to try: 3
  Enter a primitive digit to find it's appropriate data type: 123 
  123 can be fitted in:
  * byte
  * short
  * int
  * long
  Enter a primitive digit to find it's appropriate data type: 213445
  213445 can be fitted in:
  * int
  * long
  Enter a primitive digit to find it's appropriate data type: 1322145125552154
  1322145125552154 can be fitted in:
  * long
*/
