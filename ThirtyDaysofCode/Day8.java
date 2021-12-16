package ThirtyDaysofCode;
import java.util.*;
import java.io.*;

/*
Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
You will then be given an unknown number of names to query your phone book for. For each name queried, print the 
associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for name is not 
found, print Not found instead. 
*/

public class Day8{


  public static void main(String []argh){

      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();

      Map<String, Integer> phoneBook = new HashMap<String, Integer>();

      for(int i = 0; i < n; i++){
          String name = scan.next();
          int phone = scan.nextInt();
          scan.nextLine(); // good to clear buffer when expecting multiple types of input
          // Write code here
         phoneBook.put(name, phone);
      }

      
      
      while(scan.hasNext()){ // This makes this while loop accept user input as long as there are items to be inputted
        String s = scan.nextLine();

        if(s.equalsIgnoreCase("stop")){ // this is how you stop a hasNext loop
           break;
           }

        if(phoneBook.containsKey(s)){
           System.out.println(s + "=" + phoneBook.get(s)); //Easiest way to get an individual value and set in a HashMap
           }
           else {
                System.out.println("Not found");
                } 
                
      }
      scan.close();
  }
}

/*Output:
3
sam
32213213
tom
21323242 
harry
32132424  
sam
sam=32213213
tom
tom=21323242
gabriel
Not found
paul
Not found
harry
harry=32132424
stop
*/