class IndexOf {
    
    /*
    Implement strStr().

Return the index of the first occurrence of needle in haystack, or 
-1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? 
This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Example 3:

Input: haystack = "", needle = ""
Output: 0*/
    
    public int strStr(String haystack, String needle) {
     return strStr(haystack, needle, 0);
   }
   
   public static int strStr(String word, String search, int index){
       if(search.isEmpty() && !word.isEmpty()){
           return 0;
       }else if(word.isEmpty() && search.isEmpty()){
           return 0;
       }else if(index >= word.length() || search.length() > word.length()){
         return -1;
      }else if(word.charAt(index) == search.charAt(0)){
        int result = index + search.length();
         if(result > word.length()){
            result = word.length();
         }else{
            result = result;
         }
         if(word.substring(index, result).equals(search)){
            return index;
         }
      }
      
      return strStr(word, search, index + 1);
   }
}
