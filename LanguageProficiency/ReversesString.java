package LanguageProficiency;

public class ReversesString{

  public static String revereseString(String str){
      StringBuilder reverse = new StringBuilder();
      for(int idx = str.length()-1; idx >= 0; idx--){
          reverse.append(str.charAt(idx));
      }
      return reverse.toString();
  }

  public static String reverse(String str){ // This entire method is meant to just use the StringBuilder's Reverse emthod
      StringBuilder word = new StringBuilder();
      word.append(str);
      word.reverse();
      return word.toString();
  }

  public static String revo(String str){ // This entire method is meant to just use the StringBuilder's Reverse emthod
  StringBuilder word = new StringBuilder(str);
  return word.reverse().toString();
}

  

  public static void main(String[] args) {
      String hello = "Hello World!";
      System.out.println(revereseString(hello));
      System.out.println(reverse(hello));
      System.out.println(revo(hello));
      System.out.println(new StringBuilder(hello).reverse()); // fastest way
  }
}

/*


If you use String concatenation in a loop, something like this,

!  String s = "";
!  for (int i = 0; i < 100; i++) {
!      s += ", " + i;
!  }

then you should use a StringBuilder (not StringBuffer) instead of a String, because it is much faster and consumes less memory.

If you have a single statement,

String s = "1, " + "2, " + "3, " + "4, " ...;
then you can use Strings, because the compiler will use StringBuilder automatically.

*/