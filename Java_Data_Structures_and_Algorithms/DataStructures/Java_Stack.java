import java.util.NoSuchElementException;

public class Java_Stack {

   // copy the existing code for data members, constructor, isEmpty and toString methods
   private Object[] item; // The array where elements are stored
   private int open = 0;  // The index of the first empty location in the stack
   private int size = 2;  // The current number of item locations in the stack

   public Java_Stack()
   {
      item = new Object[size];
   }

   // method to insert element at top of stack
   public void push(Object element)
   {
       if(open == size) // array is full, expand the array to double its size
       {
           // create a new array of size twice its original size
           Object[] temp = new Object[2*size];
           // loop to copy the elements from item to temp
           for(int i=0;i<size;i++)
               temp[i] = item[i];
           item = temp; // update item to point to temp
           size = 2*size; // update size to twice its original
       }

       // insert element at index open
       item[open] = element;
       open++; // increment open by 1
   }

   // method to remove and return the top element of stack
   public Object pop()
   {
       if(isEmpty()) // stack is empty, throw NoSuchElementException
           throw new NoSuchElementException("Stack is empty");
       // stack is not empty
       open--; // decrement open by 1
       return item[open]; // return the element that was removed i.e at index open
   }

   public boolean isEmpty()
   {
      return open == 0;
   }

   public String toString()
   {
      if (open == 0) { return "[]"; }
      String temp = "[" + item[0];
      int i = 1;
      while (i < open)
      {
         temp = temp + ", " + item[i];
         i = i + 1;
      }
      temp = temp + "]";
      return temp;
   }  
}


class StackArrayRunner
{
   public static void main(String[] args)
   {
      Java_Stack sa = new Java_Stack(); // last in, first out
      sa.push("a");
      sa.push("b");
      sa.push("c");
      sa.push("d");
      sa.push("e");
      System.out.println(sa);
      System.out.println(sa.pop());
      System.out.println(sa);
      System.out.println(sa.pop());
      System.out.println(sa);
      System.out.println(sa.pop());
      System.out.println(sa);
      System.out.println(sa.pop());
      System.out.println(sa);
      System.out.println(sa.pop());
      System.out.println(sa);
      System.out.println(sa.pop());
   }
}