// Leet code problem 1

import java.util.*;
public class LeetCodeProblem1{
   public static void main(String[] args){
      int[] hash = {2,7,11,15, -1};
      Set<Integer> map = list(hash, 10);
      System.out.println(map);
   
   }
   
   public static Set<Integer> list(int[] array, int target){
      Set<Integer> set = new HashSet<>();
      Set<Integer> list = new TreeSet<>();
      for(int i = 0; i <= array.length - 1; ++i){
         if(set.contains(target - array[i])){
            list.add(i);
            int getOther = indexOf(array, target - array[i]);
            list.add(getOther);
           // list.add(indexOf(target - array[i]));
           }
           set.add(array[i]);
      }
      
      return list;
   
   }
   
   public static int indexOf(int[] array, int value){
      for(int i = 0; i <= array.length - 1; ++i){
         if(array[i] == value){
            return i;
         }
      }
      return -1;
   
   }


}
