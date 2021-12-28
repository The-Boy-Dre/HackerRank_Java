package ThirtyDaysofCode;
import java.io.*;


/*
Complete the factorial function in the editor below. Be sure to use recursion.
factorial has the following paramter:

* A factorial is a really cool thing in the world of mathematics.
* A factorial is shown by using an exclamation mark, as such: !
* Let’s say you get asked “What is 4!” (4 factorial).
* You simply multiply 4 by every number underneath it down to 1.
* As in, 4X3X2X1=4!
* 4X3X2X1=24
* 4!=24

Factorials can also do something amazing, that could help you in various situations.
Let’s say you and your family are getting family pictures and someone asks “How many different orders do you there are 
that we could stand for pictures?”

My family has 6 members, so let’s say there are 6 family members for pictures. Instead of trying to count by one’s, just do 6!
6!=6X5X4X3X2X1
6!=720

Therefore, there are 720 different ways you could switch everyone around.

!Returns:
!int n: the factorial of n
*/



public class Day9 {

    public static long factorial(long n) { // switched from int because the datat type was too small to store bigger factorials
        if(n > 0){
            return n * factorial(n - 1); // This line of code is being constantly called on it's self
        }
        return 1;
    }

    /*
    10 * sum(9)
    10 * ( 9 * sum(8) )
    10 * ( 9 * ( 8 * sum(7) ) )
    ...
    10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 * sum(0)
    10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 * 1 //! <--- This here is why we need to have a return 1 instead of a more common 0 because when it reaches 
                                                      ! this point it needs to multiply by a number that won't automatically turn everything else to 0.
    Answer = 3628800
    */


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\source.txt"));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = factorial(n);

        bufferedWriter.write(String.valueOf(result)); // This is how we write non string output to text documents
        System.out.println(result);

        bufferedReader.close();
        bufferedWriter.close();
    }
}


