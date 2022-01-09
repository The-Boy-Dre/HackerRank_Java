package ThirtyDaysofCode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

/*
*ArrayList is better for storing and accessing but linkedList is better for manipulating data
*/

public class Java_LinkedList {
  
  public static void main(String[] args) {
    
    LinkedList<Integer> L = new LinkedList<Integer>();
    L.add(40);
    L.add(50);
    L.addFirst(400);
    L.addLast(600);

    L.set(3, 4123);

    System.out.println(L);
    System.out.println(L.get(3));
    System.out.println(L.size());
    System.out.println(L.peek()); //Retrieves, but does not remove, the head (first element) of this list.
   
  }
}

//!A LinkedList is already a queue, since it implements the Queue interface. Hence it has the following queue operations:
//?enqueue: add() - Appends the specified element to the end of this list.
//?dequeue: remove() - Retrieves and removes the head (first element) of this list.
class QQ{

  public static void main(String[] args) {
    
    Queue<String> R = new LinkedList<String>();
    R.add("ururaka");
    R.add("Madara");
    R.add("Sasuke");
    R.add("Muu");
    
    
    
    String first = R.remove();
    

    System.out.println(R);
    System.out.println(first);

  }
}

/*
LinkedList is fast for adding and deleting elements, but slow to access a specific element. 
ArrayList is fast for accessing a specific element but can be slow to add to either end, 
and especially slow to delete in the middle.

ArrayList provides constant time for search operation, so it is better to use ArrayList 
if searching is more frequent operation than add and remove operation. The LinkedList provides 
constant time for add and remove operations. So it is better to use LinkedList for manipulation. 
*/

class DQ{

  public static void main(String[] args) {
    
    Deque<String> list = new LinkedList<>();
    list.add("rengoku");
    list.add("nezuko");
    list.add("Kakashi");
    list.add("fatpussio");
    System.out.println(list);

    String yeet = list.remove();
    System.out.println("Element removed is: "+yeet);

  }
}











class LinkedListQueue{

 private Node front, rear; 
 private int queueSize; // queue size 
  
        //linked list node
        private class Node{ 
        int data;
        Node next;
        }
  
 //default constructor - initially front & rear are null; size=0; queue is empty
 public LinkedListQueue(){
 
 front = null;
 rear = null;
 queueSize = 0;
 }
 
 
//check if the queue is empty
 public boolean isEmpty(){
    return (queueSize == 0);
 }
  
 //Remove item from the front of the queue.
 public int dequeue(){
 
    int data = front.data;
    front = front.next;
    if (isEmpty()) 
    {
    rear = null;
    }
    queueSize--;
    System.out.println("Element " + data+ " removed from the queue");
    return data;
 }
  
 //Add data at the rear of the queue.
 public void enqueue(int data){
 
    Node oldRear = rear;
    rear = new Node();
    rear.data = data;
    rear.next = null;
    if (isEmpty()) 
    {
    front = rear;
    }
    else  {
    oldRear.next = rear;
    }
    queueSize++;
    System.out.println("Element " + data+ " added to the queue");
 }


 //print front and rear of the queue
 public void print_frontRear() {
     System.out.println("Front of the queue:" + front.data 
     + " Rear of the queue:" + rear.data);
 }
}


class Dawn{

 public static void main(String a[]){
  
 LinkedListQueue queue = new LinkedListQueue();
 
 queue.enqueue(6);
 queue.enqueue(3);
 queue.print_frontRear();
 queue.enqueue(12);
 queue.enqueue(24);
 queue.dequeue();
 queue.dequeue();
 queue.enqueue(9);
 
 queue.print_frontRear();
 }
}


