

public class GenericTester {
  
  public static void main(String[] args) {
    

    myClass<Integer> object = new myClass<>(10); // Constructors are responsible for arguments being created for different objects
    myClass<Double> object2 = new myClass<>(20.20);

    object.showType();
    object2.showType();

    System.out.println("==================================");

    myClass2<String, Boolean> stuff = new myClass2<>("go freeze", true);

    stuff.showTwinType();
  }
}





//?Generics are used to make it more convenient to use different variable types when you want to use the same method or class's algorithm

class myClass<T> { // You can use whatever word or letter (as long as it's not a keyword) between the curly brackets but it's general to use a "T" 
  
T object; // Now instead of making a double or a int variable we can use a "generc" T as a shortcut;

myClass(T object){ 
  this.object = object;
}

void showType(){
  System.out.println(object.getClass().getName());
}

}


        class myClass2<T, K> { // You can also use 2 or more arguments in generics to represent more values
          
        T object; 
        K obj;

        myClass2(T object, K obj){ 
          this.object = object;
          this.obj = obj;
        }

        void showTwinType(){
          System.out.println(object.getClass().getName());
          System.out.println(obj.getClass().getName());
        }

}