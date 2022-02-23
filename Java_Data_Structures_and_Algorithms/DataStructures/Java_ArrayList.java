


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* It stores the collection of objects in the order of insertion.
* Arraylists are not automatically sorted
* Arraylists are not synchronized
* Arraylists can only be single dimensional
* Java ArrayList class can contain duplicate elements.

! Use when you don't care about duplicates but care about the order of the list
*/

public class Java_ArrayList {

  public static void main(String[] args) {
    
    ArrayList<Integer> pops = new ArrayList<Integer>();
    pops.add(12);
    pops.add(40);
    pops.add(25);

    for(int i = 0; i < pops.size(); i++){
      System.out.println(pops.get(i));
    }
  }
  
}


class LAL{

  public static void main(String[] args) {
    
    List<Integer> skips = new ArrayList<Integer>();
    skips.add(12);
    skips.add(40);
    skips.add(25);
    skips.add(40);
    System.out.println(skips);

    skips.set(1, 55);
    System.out.println(skips);

    skips.add(0, 300);
    System.out.println(skips);

    skips.remove(3);
    System.out.println(skips);
    System.out.println(skips.contains(500));

    Collections.sort(skips); //sorts list
    System.out.println(skips);

    Collections.reverse(skips); //reverses list
    System.out.println(skips);

    /*
    Output:

    [12, 40, 25, 40]
    [12, 55, 25, 40]
    [300, 12, 55, 25, 40]
    [300, 12, 55, 40]
    false
    [12, 40, 55, 300]
    [300, 55, 40, 12]
    */
  }
}

/*
    !Linked lists are preferable over arrays when:

    you need constant-time insertions/deletions from the list (such as in real-time computing where time 
    predictability is absolutely critical)

    you don't know how many items will be in the list. With arrays, you may need to re-declare and 
    copy memory if the array grows too big

    you don't need random access to any elements

    you want to be able to insert items in the middle of the list (such as a priority queue)


    !Arrays are preferable when:

    you need indexed/random access to elements

    you know the number of elements in the array ahead of time so that you can allocate the correct 
    amount of memory for the array

    you need speed when iterating through all the elements in sequence. You can use pointer math 
    on the array to access each element, whereas you need to lookup the node based on the pointer 
    for each element in linked list, which may result in page faults which may result in performance hits.

    memory is a concern. Filled arrays take up less memory than linked lists. Each element in the array 
    is just the data. Each linked list node requires the data as well as one (or more) pointers to 
    the other elements in the linked list.

    ?Arrays have O(1) random access, but are really expensive to add stuff onto or remove stuff from.
    ?Linked lists are really cheap to add or remove items anywhere and to iterate, but random access is O(n).

*/