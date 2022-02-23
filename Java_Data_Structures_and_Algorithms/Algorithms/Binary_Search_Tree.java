import java.util.Arrays;


/*
The binary search in java is the most efficient search algorithm than linear search for finding an element in the sorted array. 
The binary search in java always works on the principle of sorting array which means array elements available in 
binary search must be in ascending or descending order.
*/


public class Binary_Search_Tree {

  
  static int iterativeBinarySearch (int a[], int target) 
  {
      int left = 0; 
      int right = a.length-1;
      boolean go = true;

      while (go) {
        int m = (left + right) / 2;

        if (a[m] == target){ 
          go = false;
          return m;
        }
          else if (a[m] > target){ // the search has to work with a sorted list of items
            right = m - 1;
          }
            else {
              left = m + 1;
            }
      }
      return -1;
   }
    
  
  public static void main(String[] args) {
    
    
    int[] arr = {9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 27};
    int target = 19;

    int targetNumber = (iterativeBinarySearch(arr, target));
    System.out.println("your target number is at position "+targetNumber);

    // Output: your target number is at position 9
  }
}
//=============================================================================================================================
        class part2 {

          public static void main(String[] args) {
            
            int[] arr = {9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 27};
            int target = 19;

            int nmb = Arrays.binarySearch(arr, target);
            System.out.println("your target number is at position "+nmb);

            // Output: your target number is at position 9
          }
        }


// ============================================================================================================================

                  class part3 {
                    
                    public static int recursiveBinarySearch (int[] arr, int start, int end, int target){ 
                      
                      
                      int mid = (start + end) / 2;
                        if (arr[mid] == target){
                          return mid;
                        }

                        if(arr[mid] > target){
                          return recursiveBinarySearch (arr, start, mid - 1, target);
                        }
                        else{
                          return recursiveBinarySearch(arr, mid + 1, end, target);
                        }
                      }
                      
                                    public static void main(String[] args) {
                                      
                                      int[] arr = {9, 10, 11, 12, 13, 15};
                                      int start = 0;
                                      int end = arr.length-1;
                                      int target = 12;

                                      int targetNumber = (recursiveBinarySearch(arr, start, end, target));
                                      System.out.println("your target number is at position "+targetNumber);

                                      // Output: your target number is at position 3
                                    }
                                  }
// ============================================================================================================================
