package ThirtyDaysofCode;

import java.util.ArrayDeque;

/*
Using the Deque interface removes the dependency on the concrete Stack class and its ancestors and gives you more 
flexibility, e.g. the freedom to extend a different class or swap out different implementations of Deque 
(like LinkedList, ArrayDeque).
*/


public class Java_Arraydeque_BetterStack {
  
  public static void main(String[] args) {
    
    ArrayDeque<String> names = new ArrayDeque<>();

    names.push("Madara");
    names.push("susano");
    names.push("Ametarasu");
    names.push("Majestic destroyer flame");

    System.out.println(names);
  }
}


