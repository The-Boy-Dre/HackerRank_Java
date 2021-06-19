

//Static initialization blocks are executed when the class is loaded, 
//and you can initialize static variables in those blocks.


import java.util.Scanner;
public class Area {
    
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean canRun = true;
    
    //A static initialization blocks allows more complex initialization, for 
    //example using conditionals:
    
    static{ //static block can't contain assigned variables
    try{
        if(B <= 0 || H <= 0){
         canRun = false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception e){
        System.out.println(e);
    }

}
<<<<<<< HEAD:Java/LanguageProficiency/Area.java
public static void main(String[] args){
		if (canRun){
			int area=B*H;
			System.out.print(area);
		}
		
	}
=======
    public static void main(String[] args){
            if (canRun){
                int area=B*H;
                System.out.print(area);
            }   
            
        }
>>>>>>> parent of e270beb (Revert "update"):HackerRank_Java/LanguageProficiency/Area.java

}

/*
10
20
200
*/