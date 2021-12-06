package ThirtyDaysofCode;



/*
Given an array, A , of N integers, print A's elements in reverse order as a single line of space-separated numbers. 

Input Format:
The first line contains an integer, N (the size of our array).
The second line contains N space-separated integers that describe array A's elements.

Output Format:
Print the elements of array A in reverse order as a single line of space-separated numbers.
*/




import java.util.*;


public class Day7 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            System.out.println(arrItem);
        }

        scanner.close();
    }
}
