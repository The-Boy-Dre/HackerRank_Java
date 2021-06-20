
/*
You have to create another class that extends the abstract class. Then you can create an instance of the new class.
Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.
*/


import java.util.Scanner;
abstract class Book{  // A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class.
	String title;       // It works as a base for subclasses. 
	abstract void setTitle(String s); // can only be used in an abstract class, and it does not have a body. The body is provided by the subclass
	String getTitle(){
		return title;
	}
}

//Write MyBook class here
class MyBook extends Book{

  void setTitle(String s){ // Method recreated and given a body in the child class
   title = s;
  }

}


public class AbstractClass{
	
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();

		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);

		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}