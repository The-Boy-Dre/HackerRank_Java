// HashSet is a set, e.g. {1,2,3,4,5}
// HashMap is a key -> value (key to value) map, e.g. {a -> 1, b -> 2, c -> 2, d -> 1}
// !HashMap there must not be duplicate keys, but it may have duplicate values.
// !In the HashSet, there must be no duplicate elements.

// !HashSet does not maintains the order of its elements. Hence sorting of HashSet is not possible. However, 
// !the elements of the HashSet can be sorted indirectly by converting into List or TreeSet

/* 
!Differences between arraylist and hashset
- Hashset is unordered
- Hashset only allows unique values including 1 null value;
- arraylist is a List implementation
- arraylist stores the element in the order they were added

!Similarities between arraylist and hashset
- Both ArrayList and HashSet are non synchronized collection classes and not meant to be used in multi-threading and concurrent environments.
*/



import java.util.ArrayList;
import java.util.HashSet;

public class Java_HashSet
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
	
   public static int countUnique(ArrayList<String> list)
   {
	 HashSet<String> fruits = new HashSet<>(list);
	 return fruits.size();
   }

   
   
   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
      words.add("orange");
      words.add("blackboard"); 
      words.add("apple");  
      words.add("orange"); 
      words.add("sun");  
      words.add("moon"); 
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}





/*
import java.util.ArrayList;

public class UniqueWords
{
 
  public static int countUnique(ArrayList<String> list)
  {
   int count = 0;
   
     for (int i = 0; i < list.size(); i++)
     {		 
       for (int j = 1; j < list.size(); j++)
     {
       if(list.get(i) != list.get(j)) {
         count++;
         
         if(list.get(i) == list.get(j)) {
           count = 0;
           break;
           }
       }			   
      }
     }
   return count;
  }

  
  
  
  public static void main(String[] args)
  {
     ArrayList <String> words = new ArrayList<>();
     words.add("apple");
   words.add("orange");
   words.add("blackboard");
   words.add("apple");
   words.add("orange");
   words.add("sun");
   words.add("moon");
  
   int unique = countUnique(words);
     System.out.println(words + " has " + unique + " unique words");
  }
}
*/