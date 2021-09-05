
import java.util.Arrays;
class TwoSums {
  
    
  public int[] twoSum(int[] nums, int target) {
      for(int x = 0; x < nums.length; x++){
        for(int j = x + 1; j < nums.length; j++){
          if(nums[j] + nums[x] == target){
            return  new int[] {j, x};
          }
        }
      }
      throw new IllegalArgumentException("Damn it");
  } 


  public static void main(String[] args) {

    TwoSums jack = new TwoSums();
    int[] lizzo = {4,5,6,7,10};

    System.out.println(Arrays.toString(jack.twoSum(lizzo, 9)));
  }
}