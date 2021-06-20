

class TwoSums {
  
    
  public int twoSum(int[] nums, int target) {
      for(int x = 1; x < nums.length; x++){
        for(int j = x + 1; j < nums.length; j++){
          if(nums[j] == target - nums[x]){
            int[] a = {x, j};
            return  a;
          }
        }
      }
      //throw new IllegalArgumentException("No two sum solution");
  } 


  public static void main(String[] args) {

    TwoSums jack = new TwoSums();
    int[] lizzo = {4,5,6,7,10};

    System.out.println(jack.twoSum(lizzo, 9));
  }
}