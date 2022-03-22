class Palindrome {
     public static boolean isPalindrome(String word){
      StringBuilder builder = new StringBuilder();
      for(int i = 0; i <= word.length() - 1; ++i){
         if(Character.isLetterOrDigit(word.charAt(i))){
            builder.append(word.charAt(i));
         }
      }
      
      return isPalindrome(builder.toString().toUpperCase(), 0, builder.toString().length() - 1);
   
   }
   
   private static boolean isPalindrome(String word, int front , int back){
      if(word.isEmpty()){
         return true;
      }else if(front > back || back <= 0){
         return true;
      }else if(word.charAt(front) != word.charAt(back)){
         return false;
      }
      
      return isPalindrome(word, front + 1, back - 1);
   
   }
}
