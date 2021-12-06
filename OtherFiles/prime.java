
// This code prints the first 100 prime numbers
// prime numbers are any number over 1 that has only 2 factors, 1 and it's self

public class prime
{
    public static void main(String[] args){ 
    
        for(int i = 1; i <= 1000; i++){ // beginning of for loop
        
            int factors = 0;
            int j = 1;

                    while(j <= i){
                    
                        if(i % j == 0){
                        
                            factors++;
                        }
                        j++;
                    }

            if (factors == 2){
                System.out.print(i+" ");
            }
            
        } // end of for loop
        
    }
}














