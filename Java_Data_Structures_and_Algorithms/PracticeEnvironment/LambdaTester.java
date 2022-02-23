import java.util.ArrayList;
import java.util.List;

interface Sayable{  
  public String say(String name);  
}  

      interface Addable{  
        int add(int a,int b);  
      } 



 public class LambdaTester {

  
  public static void main(String[] args) {
    
    Sayable s1=(name)->{  
      return "Hello, "+name;  
    };  
    System.out.println(s1.say("Sonoo"));  


        Addable ad2=(int a,int b)->{  
          return (a+b);   
          };  
        System.out.println(ad2.add(100,200));  


    List<String> list=new ArrayList<String>();  
    list.add("ankit");  
    list.add("mayank");  
    list.add("irfan");  
    list.add("jai");  
    System.out.println();

    list.forEach(  
      (n)->System.out.println(n)  
    );  

  }
}
