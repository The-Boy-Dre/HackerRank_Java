package ThirtyDaysofCode;



import java.io.*;
import java.util.*;

/*
Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers. 
*/


public class Day7 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(Br.readLine().trim());

        String[] arrTemp = Br.readLine().split(" "); // This line reads a string and converts it to a String array
                                                     // It also reads the value as a string so that it can seperate it because only String's can be used with the .split() method.

        List<Integer> arr = new ArrayList<>(); //List is an interface whereas ArrayList is the implementation class of List.
        //ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]); //This line converts all the string values from the arraystandard inoput function to integers
                arr.add(arrItem);   //Meanwhile they are added to the arr ArrayList one by one
                }

            Collections.reverse(arr);

            for(int values : arr){
                System.out.print(values+" ");
                }
        
        Br.close();
    }
}

/*
Input: 4
       1 4 3  2
Output: 2 3 4 1 

Almost always List is preferred over ArrayList because, for instance, List can be translated into a LinkedList without 
affecting the rest of the codebase.
If one used ArrayList instead of List, it's hard to change the ArrayList implementation into a LinkedList one because 
ArrayList specific methods have been used in the codebase that would also require restructuring.
*/
