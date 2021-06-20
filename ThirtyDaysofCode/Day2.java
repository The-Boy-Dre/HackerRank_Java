


/*
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax 
percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. 
Round the result to the nearest integer.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {


    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
      double meal = meal_cost;
      int tip = tip_percent;
      int tax = tax_percent;

      double tip2 = (meal * tip/100);
      double tax2 = (meal * tax/100);
      
      System.out.printf("%.0f\n",meal + tip2 + tax2);
    }

}

public class Day2 {
  
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim()); // Scanner is the replacement for bufferedReader

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim()); // A bufferedRead doesn't read a file, it surrounds a input stream reader or a file reader and those are what read texts or information

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent); // This is how you call a method thats outside of your class but is in the
                                                           // same file without making your main class a child of a parent class

        bufferedReader.close();
    }
}
