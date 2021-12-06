
import java.util.ArrayList;
// version 2.0 of the Countdown application


interface TimeMonitor{
  int getTime();
}


class testCountDownClock extends Thread implements TimeMonitor {

      private int t; 
      public testCountDownClock(int start) {
        this.t = start;
      }

      public void run(){
      
      for (; t >= 0; t--){
        System.out.println("T minus " + t);
        try{
      
        Thread.sleep(1000);
        } catch (InterruptedException e){}
      
        }
        }
      public int getTime(){ 
      return t;
      }
}


class testLaunchEvent implements Runnable{ 

      private int start;
      private String message;
      TimeMonitor tm; 
      
      public testLaunchEvent(int start, String message, TimeMonitor monitor){

      this.start = start;
      this.message = message;
      this.tm = monitor;
      }

      public void run(){
      
      boolean eventDone = false;
      while (!eventDone){
    
      try{
      Thread.sleep(10); 
      } catch (InterruptedException e){}
      
      if (tm.getTime() <= start){ 
      
      System.out.println(this.message);
      eventDone = true;
      }
      
      }
      }

}


public class testCountDownApp{

  public static void main(String[] args){
  
       testCountDownClock clock = new testCountDownClock(20);
       ArrayList<Runnable> events = new ArrayList<Runnable>(); 
       
       events.add(new testLaunchEvent(16, "Flood the pad!", clock));
       events.add(new testLaunchEvent(6, "Start engines!", clock));
       events.add(new testLaunchEvent(0, "Liftoff!", clock));
       
       clock.start(); 
       for (Runnable e : events) 
       new Thread(e).start();
  }
 }