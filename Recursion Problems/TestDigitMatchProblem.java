// Author- Abdiwahid Bishar Hajir
// a class to test to Digit match recurisve problem

public class TestDigitMatchProblem{
   public static void main(String[] args){
      DigitMatch student = new DigitMatch();
      int pass = runAllTests(student);
      //4  5  6  7  7  8  8
      //4  3  6  6  7  8  9
      System.out.println();
      if(pass == 12){
         System.out.println("Congraulations all TESTS have passed!!! Abdiwahid ");
      }else{
         System.out.println(12 -  pass +  " out of 10 tests have failed check them");
      
      }
   }
   //9  8  9  8  9  8  9  8
   //            9  9  9  9
   public static int test1(int answer, int student){
      int count = 0;
      try{
         System.out.println();
      //System.out.println( digitMatch(38, 34)  );          //  1
         System.out.println("Testing on these 2 numbers 38 and 34");
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
   
   public static int test2(int answer, int student){
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 numbers 5, 5552");
         
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
   
   
   public static int test3(int answer, int student){
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 numbers 892, 892");
        
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
   // 2 9   8  8  9 2
   //       7   8 9  2
   public static int test4(int answer, int student){
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 numbers 298892, 7892");
        
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
   
   public static int test5(int answer, int student){
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 numbers 11111111, 1111");
         
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
   
   //1  1   1  1  1  1  1  1
   //             1   1  1  1  
   // expecting 1
   public static int test6(int answer, int student){
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 numbers 10000, 0");
         
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
   //9   8   9  8  9  8  9  8
  //               9  9  9  9
  // 4
   public static int test7(int answer, int student){
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 numbers 98989898, 9999");
         
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
   //1899
 //      99
 // 2
   public static int test8(int answer, int student){
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 numbers 1899, 99");
         
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
   
   //  5 7 8 9 0 8 7 
   
   // 1  4 6 7 8 9 0
   
   
   public static int test9(int answer, int student){
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 numbers 5789087, 1467890");
         
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
   
   // 4  5  6  7  7  8  8 8 8 8
   
   // 4  3  6  6   7 8  9 9 9 9
   
   
   public static int test10(int answer, int student){
      int count = 0;
      try{
         System.out.println();
         System.out.println("Testing on these 2 numbers 4567788888, 4366789999");
         
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
   
   
   public static int test11(DigitMatch s){
      int count = 0;
      try{
      System.out.println();
         int num = s.digitMatch(-1, -1);
         System.out.println();
         System.out.println("Testing on these 2 numbers -1, -1");
      }catch(IllegalArgumentException e){
         System.out.println("test passed threw an  " + e + " on -1 and -1 passed" );
         count++;
      }catch(Exception e){
         System.out.println("test failed did not  threw  proper exception " +  
        "instead threw  a  " + e + " on -1 and -1 passed" );
      
      }
      
      return count;
   }
   
   //4  5   6  7  7  8  8  8  8  8
   
   //4  3   6  6  7  8  9  9  9  9
   
   public static int test12(DigitMatch s){
      int count = 0;
      try{
      System.out.println();
         int num = s.digitMatch(-939393, -45757);
         System.out.println();
         System.out.println("Testing on these 2 numbers -939393, -45757");
      }catch(IllegalArgumentException e){
         System.out.println("test passed threw an  " + e + " on -939393 and -45757 passed" );
         count++;
      }catch(Exception e){
         System.out.println("test failed did not  threw  proper exception " +  
        "instead threw  a  " + e + " on -939393 and -45757 passed" );
      
      }
      
      return count;
   }
   
   public static int runAllTests(DigitMatch student){
   int all = 0;
      int count1 =   test1(1, student.digitMatch(38, 34));
      all += count1;
      int count2 =   test2(0, student.digitMatch(5, 5552));
      all += count2;
      int count3 =   test3(3, student.digitMatch(892, 892));
      all += count3;
      int count4 =   test4(3, student.digitMatch(298892, 7892));
      all += count4;
      int count5 =   test5(4, student.digitMatch(11111111, 1111));
      all += count5;
      int count6 =   test6(1, student.digitMatch(10000, 0));
      all += count6;
      int count7 =   test7(2, student.digitMatch(98989898, 9999));
      all += count7;
      int count8 =   test8(2, student.digitMatch(1899, 99));
      all += count8;
      int count9 =   test9(0, student.digitMatch(5789087, 1467890));
      all += count9;
      int count10 =   test10(4, student.digitMatch(4567788, 4366789));
      all += count10;
      int count11 =   test11(student);
      all += count11;
      int count12 =   test12(student);
      all += count12;
      
      return all;
   }


}
