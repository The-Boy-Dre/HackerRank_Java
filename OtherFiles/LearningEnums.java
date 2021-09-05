


public class LearningEnums {
                              // Enums can't be extended from (inherited from)_
  enum Transport{             // Enums are useful when you have a lot of static variables that you'd like to stream line
    PLANE, TRAIN, AUTOMOBILE  // Capitals are not required but it's the standard because they are                          
  }                           // supposed to be similar to constant variables


  enum Car{
    BENZ(180), HONDA(120), BMW(170);

    int speed;
    Car(int s){
      speed = s;
    }
  }



  public static void main(String[] args) {
    
    Transport ve = Transport.PLANE;

    if(ve == Transport.PLANE){
      System.out.println("ITS SUPERMAN!!!");
    }

    System.out.println(Car.HONDA.speed);

    Car br = Car.BENZ;
    System.out.println(br.ordinal());

  }
}
