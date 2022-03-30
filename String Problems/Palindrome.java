// Author- Abdiwahid Bishar Hajir
import java.util.*;

public class Palindrome {
   public static void main(String[] args){
      StringBuilder s = new StringBuilder();
      boolean yes = isPalindrome(121);
      System.out.println(yes);
      
   }
   
 //   Given an integer x, return true if x is palindrome integer.
// An integer is a palindrome when it reads the same 
// backward as forward.
// For example, 121 is a palindrome while 123 is not.
// Example 1:
// 
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right 
// and from right to left.
// Example 2:
// 
// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. 
// From right to left, it becomes 121-. 
// Therefore it is not a palindrome.
// Example 3:
// 
// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. 
// Therefore it is not a palindrome.
   public static boolean isPalindrome(int x) throws StringIndexOutOfBoundsException{
      StringBuilder string = new StringBuilder();
      StringBuilder builder = new StringBuilder();
      builder.append(x);
      string.append(x);
      string.reverse();
      System.out.println("String = " + string);
      System.out.println("Builder = " + builder);
      return isSame(string, builder);
    
   }
 
   public static boolean isSame(StringBuilder s1, StringBuilder s2){
      if(s1.length() != s2.length()){
         return false;
      }
      
      for(int i = 0; i <= s1.length() - 1; i++){
         if(s2.charAt(i) != s1.charAt(i)){
            return false;
         }
      }
      return true;
   
   }




}
