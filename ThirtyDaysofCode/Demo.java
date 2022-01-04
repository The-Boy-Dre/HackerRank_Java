package ThirtyDaysofCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


/*
Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of 
consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript. 
*/


// Java program to Demonstrate List Interface
public class Demo {

    public static void main(String[] args){
    
      List<Integer> fart = new Stack<>();
      fart.add(50);
      fart.add(40);
      fart.add(30);
      fart.add(20);
      fart.add(10);
      
      /*
      int num = 43;
      
      while(num > 0){
         fart.add(num % 2);
         num = num / 2;
      }
      */
      
      System.out.println(fart);
      int end = fart.size() - 1; //this will get us the mumber for the last index of our list

      while(end > -1){
      System.out.print(fart.get(end));
      fart.remove(end);
      end--;
      }

      System.out.println();
      System.out.println(fart);
    }
}
/*
[50, 40, 30, 20, 10]
1020304050
[]
*/

class CreateLinkedListExample {
  public static void main(String[] args) {
      // Creating a LinkedList
      LinkedList<String> friends = new LinkedList<>();

      // Adding new elements to the end of the LinkedList using add() method.
      friends.add("Rajeev");
      friends.add("John");
      friends.add("David");
      friends.add("Chris");

      System.out.println("Initial LinkedList : " + friends);

      // Adding an element at the specified position in the LinkedList
      friends.add(3, "Lisa");
      System.out.println("After add(3, \"Lisa\") : " + friends);

      // Adding an element at the beginning of the LinkedList
      friends.addFirst("Steve");
      System.out.println("After addFirst(\"Steve\") : " + friends);

      // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
      friends.addLast("Jennifer");
      System.out.println("After addLast(\"Jennifer\") : " + friends);

      // Adding all the elements from an existing collection to the end of the LinkedList
      List<String> familyFriends = new ArrayList<>();
      familyFriends.add("Jesse");
      familyFriends.add("Walt");

      friends.addAll(familyFriends);
      System.out.println("After addAll(familyFriends) : " + friends);
  }
}
/*
Initial LinkedList : [Rajeev, John, David, Chris]
After add(3, "Lisa") : [Rajeev, John, David, Lisa, Chris]
After addFirst("Steve") : [Steve, Rajeev, John, David, Lisa, Chris]
After addLast("Jennifer") : [Steve, Rajeev, John, David, Lisa, Chris, Jennifer]
After addAll(familyFriends) : [Steve, Rajeev, John, David, Lisa, Chris, Jennifer, Jesse, Walt]
*/

 class GFG1 {
  public static void main(String[] args) throws Exception
  {
      try {

          // creating object of List<String>
          List<String> list = new ArrayList<String>();

          // populate the list
          list.add("A");
          list.add("B");
          list.add("C");
          list.add("D");
          list.add("E");

          // printing the Collection
          System.out.println("List : " + list);

          // create a synchronized list
          List<String> synlist = Collections.synchronizedList(list);
                                     
          // printing the Collection
          System.out.println("Synchronized list is : " + synlist);
      }

      catch (IllegalArgumentException e) {
          System.out.println("Exception thrown : " + e);
      }
  }
}

/*
List : [A, B, C, D, E]
Synchronized list is : [A, B, C, D, E]
*/


class StackExample {
  public static void main(String[] args) {
      // Creating a Stack
      Stack<String> stackOfCards = new Stack<>();

      // Pushing new items to the Stack
      stackOfCards.push("Jack");
      stackOfCards.push("Queen");
      stackOfCards.push("King");
      stackOfCards.push("Ace");

      System.out.println("Stack => " + stackOfCards);
      System.out.println();

      // Popping items from the Stack
      String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
      System.out.println("Stack.pop() => " + cardAtTop);
      System.out.println("Current Stack => " + stackOfCards);
      System.out.println();

      // Get the item at the top of the stack without removing it
      cardAtTop = stackOfCards.peek();
      System.out.println("Stack.peek() => " + cardAtTop);
      System.out.println("Current Stack => " + stackOfCards);

  }
}

/*
Stack => [Jack, Queen, King, Ace]

Stack.pop() => Ace
Current Stack => [Jack, Queen, King]

Stack.peek() => King
Current Stack => [Jack, Queen, King]
*/


class IterateOverStackExample {
  public static void main(String[] args) {
      Stack<String> stackOfPlates = new Stack<>();

      stackOfPlates.add("Plate 1");
      stackOfPlates.add("Plate 2");
      stackOfPlates.add("Plate 3");
      stackOfPlates.add("Plate 4");

      System.out.println("=== Iterate over a Stack using Java 8 forEach() method ===");
      stackOfPlates.forEach(plate -> {
          System.out.println(plate);
      });

      System.out.println("\n=== Iterate over a Stack using iterator() ===");
      Iterator<String> platesIterator = stackOfPlates.iterator();
      while (platesIterator.hasNext()) {
          String plate = platesIterator.next();
          System.out.println(plate);
      }

      System.out.println("\n=== Iterate over a Stack using iterator() and Java 8 forEachRemaining() method ===");
      platesIterator = stackOfPlates.iterator();
      platesIterator.forEachRemaining(plate -> {
          System.out.println(plate);
      });

      System.out.println("\n=== Iterate over a Stack from TOP to BOTTOM using listIterator() ===");
      // ListIterator allows you to traverse in both forward and backward directions.
      // We'll start from the top of the stack and traverse backwards.
      ListIterator<String> platesListIterator = stackOfPlates.listIterator(stackOfPlates.size());
      while (platesListIterator.hasPrevious()) {
          String plate = platesListIterator.previous();
          System.out.println(plate);
      }
  }
}

/*
=== Iterate over a Stack using Java 8 forEach() method ===
Plate 1
Plate 2
Plate 3
Plate 4

=== Iterate over a Stack using iterator() ===
Plate 1
Plate 2
Plate 3
Plate 4

=== Iterate over a Stack using iterator() and Java 8 forEachRemaining() method ===
Plate 1
Plate 2
Plate 3
Plate 4

=== Iterate over a Stack from TOP to BOTTOM using listIterator() ===
Plate 4
Plate 3
Plate 2
Plate 1
*/


class QueueExample {
  public static void main(String[] args) {
      // Create and initialize a Queue using a LinkedList
      Queue<String> waitingQueue = new LinkedList<>();

      // Adding new elements to the Queue (The Enqueue operation)
      waitingQueue.add("Rajeev");
      waitingQueue.add("Chris");
      waitingQueue.add("John");
      waitingQueue.add("Mark");
      waitingQueue.add("Steven");

      System.out.println("WaitingQueue : " + waitingQueue);

      // Removing an element from the Queue using remove() (The Dequeue operation)
      // The remove() method throws NoSuchElementException if the Queue is empty
      String name = waitingQueue.remove();
      System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

      // Removing an element from the Queue using poll()
      // The poll() method is similar to remove() except that it returns null if the Queue is empty.
      name = waitingQueue.poll();
      System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);
  }
}

/*
WaitingQueue : [Rajeev, Chris, John, Mark, Steven]
Removed from WaitingQueue : Rajeev | New WaitingQueue : [Chris, John, Mark, Steven]
Removed from WaitingQueue : Chris | New WaitingQueue : [John, Mark, Steven]
*/


class QueueSizeSearchFrontExample {
  public static void main(String[] args) {
      Queue<String> waitingQueue = new LinkedList<>();

      waitingQueue.add("Jennifer");
      waitingQueue.add("Angelina");
      waitingQueue.add("Johnny");
      waitingQueue.add("Sachin");

      System.out.println("WaitingQueue : " + waitingQueue);

      // Check if a Queue is empty
      System.out.println("is waitingQueue empty? : " + waitingQueue.isEmpty());

      // Find the size of the Queue
      System.out.println("Size of waitingQueue : " + waitingQueue.size());

      // Check if the Queue contains an element
      String name = "Johnny";
      if(waitingQueue.contains(name)) {
          System.out.println("WaitingQueue contains " + name);
      } else {
          System.out.println("Waiting Queue doesn't contain " + name);
      }

      // Get the element at the front of the Queue without removing it using element()
      // The element() method throws NoSuchElementException if the Queue is empty
      String firstPersonInTheWaitingQueue =  waitingQueue.element();
      System.out.println("First Person in the Waiting Queue (element()) : " + firstPersonInTheWaitingQueue);

      // Get the element at the front of the Queue without removing it using peek()
      // The peek() method is similar to element() except that it returns null if the Queue is empty
      firstPersonInTheWaitingQueue = waitingQueue.peek();
      System.out.println("First Person in the Waiting Queue : " + firstPersonInTheWaitingQueue);

  }
}

/*
WaitingQueue : [Jennifer, Angelina, Johnny, Sachin]
is waitingQueue empty? : false
Size of waitingQueue : 4
WaitingQueue contains Johnny
First Person in the Waiting Queue (element()) : Jennifer
First Person in the Waiting Queue : Jennifer
*/

class IterateOverQueueExample {
  public static void main(String[] args) {
      Queue<String> waitingQueue = new LinkedList<>();

      waitingQueue.add("John");
      waitingQueue.add("Brad");
      waitingQueue.add("Angelina");
      waitingQueue.add("Julia");

      System.out.println("=== Iterating over a Queue using Java 8 forEach() ===");
      waitingQueue.forEach(name -> {
          System.out.println(name);
      });

      System.out.println("\n=== Iterating over a Queue using iterator() ===");
      Iterator<String> waitingQueueIterator = waitingQueue.iterator();
      while (waitingQueueIterator.hasNext()) {
          String name = waitingQueueIterator.next();
          System.out.println(name);
      }

      System.out.println("\n=== Iterating over a Queue using iterator() and Java 8 forEachRemaining() ===");
      waitingQueueIterator = waitingQueue.iterator();
      waitingQueueIterator.forEachRemaining(name -> {
          System.out.println(name);
      });

      System.out.println("\n=== Iterating over a Queue using simple for-each loop ===");
      for(String name: waitingQueue) {
          System.out.println(name);
      }
  }
}
/*
=== Iterating over a Queue using Java 8 forEach() ===
John
Brad
Angelina
Julia

=== Iterating over a Queue using iterator() ===
John
Brad
Angelina
Julia

=== Iterating over a Queue using iterator() and Java 8 forEachRemaining() ===
John
Brad
Angelina
Julia

=== Iterating over a Queue using simple for-each loop ===
John
Brad
Angelina
Julia
*/


class thegrind {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        // Using the offer() method
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);
    }
}

/*
PriorityQueue: [2, 4]
Updated PriorityQueue: [1, 4, 2]
*/


class Nana {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("PriorityQueue: " + numbers);

        // Using the peek() method
        int number = numbers.peek();
        System.out.println("Accessed Element: " + number);
    }
}
/*
PriorityQueue: [1, 4, 2]
Accessed Element: 1
*/

class Blib {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println("PriorityQueue: " + numbers);

        // Using the remove() method
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        // Using the poll() method
        int number = numbers.poll();
        System.out.println("Removed Element Using poll(): " + number);
    }
}
/*
PriorityQueue: [1, 4, 2]
Is the element 2 removed? true
Removed Element Using poll(): 1
*/

class slain {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.print("PriorityQueue using iterator(): ");

        //Using the iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
/*
PriorityQueue using iterator(): 1, 4, 2, 
*/

class Ma {

    public static void main(String[] args) {
        // Creating Deque using the ArrayDeque class
        Deque<Integer> numbers = new ArrayDeque<>();

        // add elements to the Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        numbers.push(4);
        System.out.println("Deque: " + numbers);

        // Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element: " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);
    }
}
/*
Deque: [3, 1, 2]
First Element: 3
Last Element: 2
Removed First Element: 3
Removed Last Element: 2
Updated Deque: [1]
*/