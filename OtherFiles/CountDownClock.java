
import java.util.ArrayList;

public class CountDownClock extends Thread {

    public void run() {
   
   for (int t = 20; t >= 0; t--){
      System.out.println("T minus " +t);

      try{
      Thread.sleep(1000);  // Represented in milliseconds
     } catch (InterruptedException e){}
      
    }
  }
 
}


class LaunchEvent implements Runnable{

  private int start;
  private String message;
  public LaunchEvent(int start, String message){
    this.start = start;
    this.message = message;
  }
  
public void run(){

  try{
  Thread.sleep(20000 - (start * 1000));
  }
  catch(InterruptedException e){}
  System.out.println(message);
}

}



 class CountDownApp {

  public static void main(String[] args) {
    
    Thread clock = new CountDownClock();

    ArrayList<Runnable> events = new ArrayList<Runnable>();
    events.add(new LaunchEvent(16, "Flood the pad!"));
    events.add(new LaunchEvent(6, "Start engines!"));
    events.add(new LaunchEvent(0, "Liftoff!"));
    clock.start();

    for (Runnable e : events){
    new Thread(e).start();
    }

  }
} 




