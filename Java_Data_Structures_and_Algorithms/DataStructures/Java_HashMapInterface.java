

import java.util.HashMap;
import java.util.Map;

/*
Map is an interface that provides a blueprint for data structures that take (key, value) pairs and map keys to their associated 
values (it's important to note that both the key and the value must be Objects and not primitives). The implementation is 
done by implementing classes such as HashMap or LinkedHashMap. Consider the following code:

Declare a String to String map
Map<String, String> myMap; 

Initialize it as a new String to String HashMap
myMap = new HashMap<String, String>();  

Change myMap to be a new (completely different) String to String LinkedHashMap instead
myMap = new LinkedHashMap<String, String>(); 
*/

public class Java_HashMapInterface {

  public static void main(String[] args) {
    // Days of the week when my illegals are to be working
    Map<String, String> englSpanDictionary = new HashMap<String, String>();
    // Putting them inside our dictionary
    // The item on the left is the key and the one on the right is the value
    englSpanDictionary.put("Monday", "Lunes");
    englSpanDictionary.put("Tuesday", "Martes");
    englSpanDictionary.put("Wednesday", "Pooki");
    englSpanDictionary.put("Thursday", "Pablo");
    englSpanDictionary.put("Friday", "Carlos");
    // Retreiving things from our dictioonary
    System.out.println(englSpanDictionary.get("Monday"));
    System.out.println(englSpanDictionary.get("Tuesday"));
    System.out.println(englSpanDictionary.get("Wednesday"));
    // Prints out all keys and their respected values
    System.out.println(englSpanDictionary.entrySet());
    // Prints out all respected values
    System.out.println(englSpanDictionary.values());
    // Prints out all respected keys
    System.out.println(englSpanDictionary.keySet());
    // Prints out the size
    System.out.println("The size of our dictionary is: " + englSpanDictionary.size());
    System.out.println();
    System.out.println();

    String requestedItem = "Tuesday";
    System.out.println(requestedItem+"="+englSpanDictionary.get(requestedItem));

    System.out.println();
    System.out.println();

    // SHopping list
    Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
    // Putting things in the list
    shoppingList.put("Ham", Boolean.TRUE);
    shoppingList.put("Bread", Boolean.TRUE);
    shoppingList.put("Oreos", Boolean.TRUE);
    shoppingList.put("Eggs", Boolean.FALSE);
    shoppingList.put("Sugar", Boolean.FALSE);
    // Retreive things from our dictionary
    System.out.println(shoppingList.get("Ham"));
    System.out.println(shoppingList.get("Oreos"));
    System.out.println(shoppingList.get("Sugar"));
    // Key values pairs print out
    System.out.println(shoppingList.toString());
    // Removing a dictionary set
    shoppingList.remove("Eggs");
    // Replacing a dictionary set
    shoppingList.replace("Sugar", true);

    // Traversing through the map
    for (Map.Entry<String, Boolean> things : shoppingList.entrySet()) {
      System.out.print(things.getKey() + ":");
      System.out.println(things.getValue());
    }


    // Clear our dictionary
    shoppingList.clear();
    System.out.println(shoppingList.toString());

    /*
     * Since Map is an interface, it can be used only with a class that implements this interface.
      Java has two hash table classes: HashTable and HashMap. In general, you should use a HashMap. 
      While both classes use keys to look up values, there are some important differences, including: 
      A HashTable doesn't allow null keys or values; a HashMap does.

    * When to use HashMap and Hashtable? HashMap should be preferred over Hashtable for the 
      non-threaded applications. In simple words , use HashMap in unsynchronized or single 
      threaded applications . We should avoid using Hashtable, as the class is now obsolete 
      in latest Jdk 1.8 .

      Precisely when you want the differences between the two:

    * When you want to run on Java 1.1
    * When you want each operation to be synchronized (getting you a form of thread safety, so long as you never iterate over it) - and for some reason don't want to use Collections.synchronizedMap over a HashMap
    * When you don't want to be able to store null values
    * When the memory difference is actually significant (only after you've proved this is the case) - I wasn't even aware of this difference, personally...
    * When you're forced to by a nasty API which returns or takes Hashtable (relatively rare, fortunately)

    I can't remember the last time I was in that situation, personally - I would say it's vanishingly rare to be appropriate to 
    use Hashtable in modern Java code.
     */


     /*
      Output: 

      Lunes
      Martes
      Pooki
      [Monday=Lunes, Thursday=Pablo, Friday=Carlos, Wednesday=Pooki, Tuesday=Martes]
      [Lunes, Pablo, Carlos, Pooki, Martes]
      [Monday, Thursday, Friday, Wednesday, Tuesday]
      The size of our dictionary is: 5


      Tuesday=Martes


      true
      true
      false
      {Ham=true, Oreos=true, Eggs=false, Sugar=false, Bread=true}
      Ham:true
      Oreos:true
      Sugar:true
      Bread:true
      {}
     */
  }
}
