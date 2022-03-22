import java.util.*;

class Insertion {
  public static int[] insertionSort(int[] array) {
    // Write your code here.
		// Arrays.sort(array);
		// return array;
		
		// insertion sort algrothim. 
		
		//[8,5,2,9,5,6,3]
		
		// we start with 8. 8 is a sorted number. We start iterarting through the 
		// rest of the list. We look at 5 next and we say 5 goes before 8. So we insert 8 before 
		// 8 so they become sorted. We then move onto 2 and we want insert 2 in the sorted list. 
		
		// compare 2 to 8 is it less than 8 yes so we swap them its also less than 5 
		
		// so we swap them. We can then know see [2,5,8,9,5,6,3] we can see 2 5 and 8 is sorted.
		// we move and We compare 9 know 9 we can see 9 is bigger than 8 so we dont have to move it.
		
		// we move onto 5 we comapre 5 to 9 we see 5 is less than 9 so we swap 5 and 9. we compare 
		
		// 5 to 8 5 is less than 8 so we swap them. we then move ontpo 5 we can 5 and 5 are equal 
		
		// so we found the correct position to insert 5. We then move on to 6. 6 is less than 
		
		// 9 and 8 so we swap them we comapre 6 to 5. 6 is greater than 5 so it is in the correct 
		//position. We then finally move onto 3. We compare 3 to 9 swap them. 
		
		// compare 3 to 8, 6, 5, etc... till we find 2 is less than 3 so we move 3 to that position.
		
		// The space complexoty of this algrothim o(1). O(n^2) is the time complexity. Worst case 
		
		// if we have to do a bunch of swapping. But if we had a sorted array we only need to look
		
		// at every element once 0(n)
	int top = array[0];
		for(int i = 1; i <= array.length - 1; ++i){
			int j = i;
			while(j > 0 && array[j] < array[j - 1]){
				swap(j, j - 1, array);
				j--;
			}
		}
		
		return array;
  }
	
	public static void swap(int index1, int index2, int[] array){
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
