package ThirtyDaysofCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class reee {
  
  
  public static void main(String[] args) throws IOException {
    
   // BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
      BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\source.txt"));
      
      String s;
      while((s = bufferedReader.readLine()) != null){
        System.out.println(s);
      }

      bufferedReader.close();
    }
  }

  

public class SUSS {  
  
  public static void main(String[] args) throws Exception {     
    
    BufferedWriter buffer = new BufferedWriter(new FileWriter("D:\\source.txt"));  
    buffer.write("Welcome to javaTpoint.\n");  
    buffer.write("chad\n");
    buffer.write("charles\n");
    buffer.write("richy");
    buffer.close();  
    System.out.println("Success");  
    
  }  
}

