// Author- Abdiwahid Bishar Hajir
// a class to test to IndexOf  recurisve problem

public class TestIndexOfProblem{
   public static void main(String[] args){
      IndexOf student = new IndexOf();
      int pass = runAllTests(student);
      System.out.println();
      if(pass == 14){
         System.out.println("Congraulations all TESTS have passed!!! Abdiwahid ");
      }else{
         System.out.println(14 -  pass +  " out of 10 tests have failed check them");
      
      }
   }
   //9  8  9  8  9  8  9  8
   //            9  9  9  9
   public static int test1(int answer, int student) throws UnsupportedOperationException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these Abdiwahid and  abdi");
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           ); 
         }
      } catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      
      return count;
   }
   
   public static int test2(int answer, int student) throws UnsupportedOperationException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 string Hajir, jir");
         
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           ); 
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      return count;
   }
   
   
   public static int test3(int answer, int student) throws UnsupportedOperationException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 strings Barack Bar");
        
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           ); 
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      return count;
   }
 
   public static int test4(int answer, int student) throws UnsupportedOperationException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 strings Index index");
        
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           ); 
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      return count;
   }
   
   public static int test5(int answer, int student)throws UnsupportedOperationException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 string you, o");
         
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           );  
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      return count;
   }
   
   
   public static int test6(int answer, int student)throws UnsupportedOperationException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these strings 2 Java, a");
         
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           );  
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      return count;
   }
 
 
   public static int test7(int answer, int student)throws UnsupportedOperationException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 strings AEIOUY, O");
         
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           ); 
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      return count;
   }
   
   public static int test8(int answer, int student)throws UnsupportedOperationException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 Count, nt");
         
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           );  
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      return count;
   }
   
 
   
   public static int test9(int answer, int student)throws UnsupportedOperationException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 strings ABDIWAHIDBISHARHAJIR, HAJIRHAJIR");
         
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           );  
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      return count;
   }
  
   
   public static int test10(int answer, int student)throws UnsupportedOperationException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 strings ILOVEYOU, love");
         
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           ); 
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      
      return count;
   }
   
   
   public static int test11(IndexOf s, int answer, int student)throws IllegalArgumentException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 strings LeetCode, leet");
         
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           ); 
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      
      return count;
   }
   
   public static int test13(IndexOf s) throws NullPointerException{
      int count = 0;
      System.out.println();
      try{
         System.out.println("testing on 2 empty string");
         int result = s.indexOf("" , "");
         if(result != 0){
            System.out.println("expecting to return 0 for 2 empty strings " +
               "but got " + result);
         }else{
            System.out.println("Test passed expecting to return 0 for 2 empty strings " +
               "you returned " + result);
            count++;
         }
      
      
      
      }catch(Exception e){
         System.out.println("Test failedThrew an " + e + " 2 empty string");
         
         
      }
      
      return count;
   
   }
   
   public static int test14(IndexOf s) throws NullPointerException{
      int count = 0;
      System.out.println();
      try{
         System.out.println("testing on abdiwahid, and a  empty search string");
         int result = s.indexOf("abdiwahid" , "");
         if(result != 0){
            System.out.println("expecting to return 0 for the string abdiwahid" +
            " and empty search string " +
               "but got " + result);
         }else{
            System.out.println("Test passed expecting to return 0 for 2 empty strings " +
               "you returned " + result);
            count++;
         }
      
      
      
      }catch(Exception e){
         System.out.println("Test failed Threw a " + e + " for the string abdiwahid, and a  empty search string");
         
      }
      
      return count;
   
   }
   
  
   public static int test12(IndexOf s, int answer, int student)throws IllegalArgumentException{
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 numbers Like, ike");
         
         if(answer == student){
            System.out.println("test pass expected " + answer + " and you returned " + student);
            count++;
         }else{
            System.out.println("Test failed expected " + answer + " but got " + student
                           ); 
         }
      }catch(Exception e){
         System.out.println("test failed threw a " + e);
      }
      
      return count;
   }
   
   public static int runAllTests(IndexOf student)throws RuntimeException{
      int all = 0;
   //Abdiwahid Abdi
      int count1 =   test1(0, student.indexOf("Abdiwahid", "Abdi"));
      all += count1;
      // Hajir jir
      int count2 =   test2(2, student.indexOf("Hajir", "jir"));
      all += count2;
      // Barack Bar
      int count3 =   test3(0, student.indexOf("Barack", "Bar"));
      all += count3;
      // Index index
      int count4 =   test4(-1, student.indexOf("Index", "index"));
      all += count4;
      // you o
      int count5 =   test5(1, student.indexOf("you", "o"));
      all += count5;
      // Java a
      int count6 =   test6(1, student.indexOf("Java", "a"));
      all += count6;
      // AEIOUY 
      int count7 =   test7(3, student.indexOf("AEIOUY", "O"));
      all += count7;
      // Count nt
      int count8 =   test8(3, student.indexOf("Count", "nt"));
      all += count8;
      int count9 =   test9(-1, student.indexOf("ABDIWAHIDBISHARHAJIR", "HAJIRHAJIR"));
      all += count9;
      // ILOVEYOU
      int count10 =   test10(-1, student.indexOf("ILOVEYOU", "love"));
      all += count10;
      // LeetCode leet
      int count11 =   test11(student, -1, student.indexOf("LeetCode", "leet"));
      all += count11;
      // Like ike
      int count12 =   test12(student, 1, student.indexOf("Like", "ike"));
      all += count12;
      
      int count13 =   test13(student);
      all += count13;
      
      int count14 =   test14(student);
      all += count14;
      return all;
   }


}
