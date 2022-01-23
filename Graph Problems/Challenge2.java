import java.util.*;
/* @Author- Abdiwahid Bishar Hajir */
class Challenge2{

//Write a method hasOdd that takes a Set of integers as a 
// parameter and that returns true if the set contains at 
// least one odd integer, and false otherwise. 
// If passed the empty set, your method should return false.
   public static boolean hasOdd(Set<Integer> set){
      Iterator<Integer> inter = set.iterator();
      while(inter.hasNext()){
      int number = inter.next();
         if(number % 3 == 1){
            return true;
         }
      }
      return false;
   }

}