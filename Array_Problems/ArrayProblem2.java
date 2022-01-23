import java.util.*;
public class ArrayProblem2{
   public static void main(String[] args){
   int[] array = {5,8,1,3,4,5};
   int[] newArray = squaredArray(array);
   System.out.println(Arrays.toString(newArray));
   
   }
   
   // write a method called squaredArray that takes 
   // in a input array that is not sorted and 
   // sorts the array in place. Such that the method 
   // returns a new array of the elements in the orginal 
   // input array. Such that each elements appear 
   // in order squared. For example if your given 
   // an input array with the following values [5,8,1,3,4,5]
   // your method should return this array.
   // [1, 9, 16, 25, 25, 64] We can see this output 
   //array sorted the orginal array [1,3,4,5,5,8] and squared
   // every element at each index. Your task is the write 
   // the code to be able to do this processing with the array,
   public static int[] squaredArray(int... array){
      int[] result = new int[array.length];
      Arrays.sort(array);
      for(int i = 0; i <= array.length - 1; ++i){
      result[i] = array[i] * array[i];
      
      }
   
      return result;
   }



}