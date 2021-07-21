import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class test{

  public static void main(String[] args) {
    
   LinkedList<String> officers = new LinkedList<String>();
   officers.add("Blake");
   officers.add("Burns");
   officers.addLast("cody");
   officers.addFirst("jawas");
   officers.add(1, "michael angelo!");
   officers.remove("jawas");

   for(String s : officers){
     System.out.println(s);
   }

   Queue<Integer> troy = new PriorityQueue<Integer>();
   troy.add("football star");
   troy.add("jermaine cole");

  }
}


