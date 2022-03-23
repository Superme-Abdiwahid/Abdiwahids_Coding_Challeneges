// Author- Abdiwahid Bishar Hajir
import java.util.*;

class BinarySearch {
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
//     //Built in binary search.
//     Arrays.sort(array);
//     int Binary = Arrays.binarySearch(array, target);
//     return Binary;
    //----------------------------------------------------------
    //implemantion
     return binarySearch(array, target, 0, array.length - 1); // recurisve solution
  }
	
	
	// how binary search works is that we are givem a sorted array.
	
	// intaizlae a left pointer that points that points to first number in the array
	
	// intaizlae a right number that points to last value in  the array;
	
	// grab the indexes of the 2 pointers. 
	// The first one is 0 and the right pointer is the last index array.length - 1
	
	
	// we need to create a middle number that tells where we the startimg point would be in our array
	// to calcuate the middle numbver. The sum of the index of the left pointer 
	// + right pointer and then dividing  that. (rightPointer + leftPointer) / 2.
	
	// then once we get our middle number we create a varible to grab that index. 
	// from the array that is where our middle would be.
	
	// then we need to checkthje first thing is our target number == middle number 
	
	// if this is the case we can just return that number right away. Otherwise we 
	
	// keep exploring in our input array. We would then check if the target number is greater
	
	// then the middle number if this is the case then we would move our left pointer one greater than 
	
	// middle by 1. And then reculare our middle with the array shrunk
	
	// otehrwise we would check if our target number is less than our middle if this is the case 
	
	// we move our right pointer to be = middle - 1; 
	
	
	// recall middle number after we check if the target is greater or less than our target value.
	
	// when the left pointer is bigger than the right pointer thats when we are done and it cannot
	// be found and we just return -1.
	
	
	// tim complexity  O(log(n)) where n is n is the length of the input array.
	
	
	// the reason why its O(log()) because we are elaimating the search and breaking it into half.
	
	// space complexity if we implment it iterativly it would run in O(1) space. We are not 
	// using additional memeory somewhere . If we implment it recurisvly we migt have O(log(n)) because 
	// of space and memeory on the call stack.
	//________________________________________________________
	
	// recrurisve solution
	// private static int binarySearch(int[] array, int target, int leftPointer, int rightPointer){
	// 	if(leftPointer > rightPointer){
	// 		return -1;
	// 	}else{
	// 		int middle = (leftPointer + rightPointer) / 2;
	// 		int match = array[middle];
	// 		if(target == match){
	// 			return middle;
	// 		}else if(target < match){
	// 			return binarySearch(array, target, leftPointer, middle - 1); // we are doing this because our 
	// 			// poterianl is less than our max so we want elimate the entire right half of the array.
	// 			// so we move our right pointer over to the left which is middle - 1
	// 		}else{
	// 			return binarySearch(array, target, middle + 1, rightPointer);
	// 		}
	// 	}
	// }
	
	// iterative solution
	private static int binarySearch(int[] array, int target, int leftPointer, int rightPointer){
		while(leftPointer <= rightPointer){
			int middle = (leftPointer + rightPointer) / 2;
			int match = array[middle];
			if(target == match){
				return middle;
			}else if(target < match){
				rightPointer = middle - 1;
			}else{
				leftPointer = middle +  1;
			}
		}
		return -1;
	}
}
