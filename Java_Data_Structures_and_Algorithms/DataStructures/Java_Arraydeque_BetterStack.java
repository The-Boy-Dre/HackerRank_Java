

import java.util.ArrayDeque;
import java.util.Deque;

/*
Using the Deque interface removes the dependency on the concrete Stack class and its ancestors and gives you more 
flexibility, e.g. the freedom to extend a different class or swap out different implementations of Deque 
(like LinkedList, ArrayDeque).
*/


public class Java_Arraydeque_BetterStack {
  
  public static void main(String[] args) {
    
    ArrayDeque<String> names = new ArrayDeque<>();

    names.push("Madara"); //Pushes an element onto the stack represented by this deque. In other words, inserts the element at the front of this deque. 
    names.push("susano");
    names.push("Ametarasu");
    names.push("Majestic destroyer flame");

    System.out.println(names);
    System.out.println(names.peekFirst()); //Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
  
    System.out.println("removed "+names.pop()+" from list"); //Pops an element from the stack represented by this deque. In other words, removes and returns the first element of this deque. 
    System.out.println(names);
    System.out.println(names.size()); //Returns the number of elements in this deque.
    System.out.println("Is the improvised stack empty? "+names.isEmpty());
    System.out.println();

    System.out.println(names.element()); // This method differs from peek only in that it throws an exception if this deque is empty. 
    names.poll();
    System.out.println(names); //Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty. 
    
    names.addFirst("Renne Rebirth"); //Inserts the specified element at the front of this deque.
    names.addLast("Burning Ash"); //Inserts the specified element at the end of this deque.
    names.offer("Edo Tensei"); //Inserts the specified element at the end of this deque.
    System.out.println(names);

    Deque<String> kibble = new ArrayDeque<>(names.clone()); //Returns a copy of this deque.
    System.out.println();
    System.out.println(kibble);
  } 
}

/*
 ArrayDeque is a Doubly ended Queue implemented as an Array. So, it can grow relatively faster. If you do not plan to use 
 syncronized stack, then ArrayDeque is probably better than Stack which is Thread safe(and hence slow).

 [Majestic destroyer flame, Ametarasu, susano, Madara]
 Majestic destroyer flame
 removed Majestic destroyer flame from list
 [Ametarasu, susano, Madara]
 3
 Is the improvised stack empty? false

 Ametarasu
 [susano, Madara]
 [Renne Rebirth, susano, Madara, Burning Ash, Edo Tensei]

 [Renne Rebirth, susano, Madara, Burning Ash, Edo Tensei]
 */