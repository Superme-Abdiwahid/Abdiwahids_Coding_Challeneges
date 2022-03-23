// Author- Abdiwahid Bishar Hajir
class ReverseInteger {
    
    
    //Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside // the signed 32-bit integer range [-231, 231 - 1], then return 0.
    public  int reverse(int x)throws StringIndexOutOfBoundsException{
      StringBuilder builder = new StringBuilder();
      int result = 0;
      if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE){
         return 0;
      }else{
         long temp =(long) x;
         int length = 0;
         while(Math.abs(temp) > 0){
            temp = temp / 10;
            length++;
         }
         int sum = x;
         for(sum = x; sum > 0; sum = sum){
            if(sum % 10 == 0){
               sum = sum / 10;
            }else{
               break;
            }
         
         }
         if(sum < 0){
            builder.append(sum);
         }else{
            builder.append(sum);
         }
         builder.reverse();
         if(x < 0){
            sum = Math.abs(sum);
            builder.append(sum);
            builder.reverse();
            builder.delete(0,length + 1);
            builder.reverse();
            builder.insert(0, "-");
         
         }
      }
      try{
         result = Integer.parseInt(builder.toString());
      }catch(NumberFormatException ex){
         return 0;
      }
      
      return result;
   }
}
