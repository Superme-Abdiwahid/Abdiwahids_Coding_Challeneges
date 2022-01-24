// @Author Abdiwahid Bishar Hajir
// Copyright Abdiwahid Bishar Hajir 2022
import java.util.*;

class Program {
  public static class LinkedListProblem1 {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  
  // Write a method. removeDuplicatesFromLinkedList that takes a head of a LinkedList.
  // And this method should modify the list such that new list returned should contains 
  // elements of a linked list with all duplicates values removed for example if the head of the linked list stored 
  // the following values head --> 1 --> 2 --> 2 --> 2 --> 3 ---> 3 ---> 3 ---> 4 ---> 17 ---> 17 ---> 18 ---> 18 ---> 25 ---> null
  
  // and your method was to be called on that list your method should return the modified head of the linked list to be
  
  // the following head ---> 1 ---> 2 ---> 3 ---> 4  ---> 17 ---> 18 ---> 25 --> null.
  
  // you may assume that you are given a node class with the following fields
  
  // a next pointer to access to the next node in the linked List and a value
  
  // that stores data in the nodes. You may also assume you will always be given 
  
  // a linked list that is always sorted from smallest to highest. An empty list has no duplicates
  
  public LinkedList removeDuplicatesFromLinkedList(LinkedList head) {
      LinkedList prev = null;  // prev --> null
      LinkedList lookAhead = null;  // prev --> null
      LinkedList seen = null; // seen --> null
      int size = 0;
      int listSize = 0;
      LinkedList toBeSeen = null;
      if(head != null){
         for(LinkedList temp = head; temp.next != null; temp = temp.next){ 
           // this loop is the case when we are given a linked list that has these values 
           
           // head ---> 1 ---> 1 ---> 1 ---> 1 ---> 1 ---> 1 --> null handles such a list 
           
           // keeping track of wether we reach the list and the numbers are all the same in this case the counter
           // keeps track of the size of the list if its the case the size varaible == size of the entire list
           
           // we need to just set the head.next == null because we are not given another other unique dupilcate values.
            listSize++;
            toBeSeen = temp;
            if(temp.value == toBeSeen.next.value){
               size++;
            }else{
               size = 0; // if we ever hit this else case that means we seen a unqiue value so the 
              // list doesnt contain all one number elements
            }
         
         }
         if(size == listSize){
            head.next = null;    // case we are given list of the same values that are duplicated for the 
           // entire list such as head ---> 1 ---> 1 ---> 1 ---> 1 ---> 1 ---> 1 --> null 
         }else{
            LinkedList current = head;
            for(current = head; current != null; current = current.next){
               if(prev == null){                //
                  lookAhead = current.next; // lookAhead  ---> 2 ---> 3 ---> 4  ---> 17 ---> 18 ---> 25 --> null.
                  prev = current;// prev --> head ---> 1 ---> 2 ---> 3 ---> 4  ---> 17 ---> 18 ---> 25 --> null.
                  current.next = prev;  
                  current = current.next;
                  seen = prev;
               }
               if(lookAhead != null && lookAhead.value != seen.value){
                  prev.next = lookAhead;
                  seen = seen.next;
                  prev = prev.next;
                  if(lookAhead != null && current.next != null && current.next.value == prev.value && current.next.next== null){
                 //   ^ A case when the element is at the end of the list
                    prev.next = null;
                     if(lookAhead.value == current.value && current.next != null && current.next.next == null){
                        prev.next = null;  // a case when we reached the end and the numbers are the same we set what 
                       // prev next is poiting to when we seen all the numbers and reach the end of the list;
                     }
                  }
                  
               }
               current = lookAhead;  // update current to be lookAhead as  lookAhead will always look ahead in the list
              // and store reference to those.
               if(lookAhead != null)
                  lookAhead = lookAhead.next; // update lookAhead to keep looking Ahead values in the list
            }
            if(lookAhead == null || prev.value == lookAhead.value){ // case when the list is for example
              // 1--->2--->3--->3--->43--->43--->null and lookedAhead reaches null and prev is pointing to the 3 we set 3 to point 
              // to 43
               prev.next = null;
            }
         }
      }
   	return head;
   }
	
}
