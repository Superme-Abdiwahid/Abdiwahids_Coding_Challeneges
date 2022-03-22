class ValidParentheses {
    public boolean isValid(String str) {
         if(str.charAt(str.length() - 1) == '[' || str.charAt(str.length() - 1) == '('
      || str.charAt(str.length() - 1) == '{' || Character.isLetter(str.charAt(str.length() - 1))){
      return false;
   }
      // Write your code here.
      
      // the string needs to have as many opening brackets as closing bracket.
      
      // use a stack. Last in first out. The reason why using a stack is nice is
      
      // we want to keep track of every pair of matching brackets. For every opening bracker
      
      // we want to find out the coorespening closing bracket. For example
      
      // (([] () () ) {} )
      
      // we travese the input string we check if our character is an opening bracket eg ( [ {
      
      // if it is we store it in the stack.
      // [(, (,  [,                            ]
      
      // the next character in the string is a closing bracket. We first check if our stack is empty
      
      
      //  if the stack is empty our string is unblanced. We want to check the last bracket. If
      
      // the last bracket in the stack is not equal to the type of the closing bracket we popped
      
      // of the stack. Then our string is unbalanced. We pop of the stack
      
      Stack<Character> stack = new Stack<>();
      for(int i = 0; i < str.length(); ++i){
         Character type = str.charAt(i);
         if(type == '(' || type == '[' || type == '{'){
            stack.push(type);
         }else if(type == ')'){
            if(stack.isEmpty()){
               return false;
            }else{
               if(stack.pop() != '('){
                  return false;
               }
            }
         }else if (type == ']'){
            if(stack.isEmpty()){
               return false;
            }else{
               if(stack.pop() !='['){
                  return false;
               }
            }
         }else if (type =='}'){
            if(stack.isEmpty()){
               return false;
            }else{
               if(stack.pop() != '{'){
                  return false;
               }
            }
         }
      }
		 return stack.isEmpty();
	 }

}
