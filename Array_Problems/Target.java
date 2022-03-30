// Author- Abdiwahid Bishar Hajir
import java.util.Set.*;
import java.util.*;
class Target{

   public static void main(String[] args){
   int[] array = {3,5,-4,8,11, 1, -1, 6};
   int[] old  = targetSum(array, 10);
   System.out.println(Arrays.toString(old));
   }

   // Write method called targetSum that 
   // takes in a input array. And a target value. 
   // find out wether 2 values in the input sum up to 
   // target value. For example if your given 
   // this array [1,12,-11,1,7] and the target value is 10.
   // your method should return a new array that stores
   // the following values [-11, 1] because -11 and 1 added
   // togther gives you 10 which is equal to the target value.
   public static int[] targetSum(int[] array, int targetSum)throws UnsupportedOperationException{
      Set<Integer> set = new HashSet<>(); // we use a hashSet because
      // its 0(1) operation but O(n) space
      for(int i = 0; i <= array.length - 1; ++i){
         if(set.contains(targetSum - array[i])){
            return new int[]{targetSum - array[i], array[i]};
         }
         set.add(array[i]); // add to the set elementing duplictes
      }
   
      return new int[]{}; // if we ever reach this case we should return 
      // an empty array because we never found the values so we 
      // return an empty array.
   
   }
   
   



}
