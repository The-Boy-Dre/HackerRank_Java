


/*
LinkedHashSet is an ordered version of HashSet that maintains a doubly linked list across all eleemtns. 
Use this class instead of HashSet when you care about the iteration order. When you iterate through a HashSet the 
order is unpredictable, while a LinkedHashSet lets you iterate though the elemtns in the order in which they
were inserted.

!Duplicate values are not allowed
*/



import java.util.HashSet;
import java.util.LinkedHashSet;


public class Java_LinkedHashSet{

  public static void main(String[] args) {
    
    HashSet<String> words = new HashSet<>();
    words.add("Wolf");
    words.add("cockSpaniel");
    words.add("Jerry springer");
    words.add("Wiggy Jiggy");

    System.out.println(words);
    System.out.println();

    LinkedHashSet<String> Dogos = new LinkedHashSet<>();
    Dogos.add("Wolf");
    Dogos.add("cockSpaniel");
    Dogos.add("Jerry springer");
    Dogos.add("Wiggy Jiggy");

    System.out.println(Dogos);
  }
}


