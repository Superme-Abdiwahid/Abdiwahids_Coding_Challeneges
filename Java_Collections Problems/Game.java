import java.util.*;
public class Game{
   public static void main(String[] args){
   //[ [James:10, Jordan:8, Don:0, Ory:13, London:2, Kittle:1] ]
   List<List<String>> list = new LinkedList<>();
   List<String> newList = new LinkedList<>();
   newList.add("James:10");
   newList.add("Jordan:8");
   newList.add("Don:0");
   newList.add("Ory:13");
   newList.add("London:2");
   newList.add("Kittle:1");
   list.add(newList);
   Map<String, String> gameResults = soccerGame(list);
   System.out.println(gameResults);
   }


// Write a program that takes in a 2 dimensional input list.
// Containing information about a soccer game. 
// the input list contains inputs in the form of 
// player and goals. Your task is to write a method 
// which process this lists and that returns a map 
// with the players name and how many goals they scored.
// throughout the season. 

// For example if given a list like this 

//[ [James:10, Jordan:8, Don:0, Ory:13, London:2, Kittle:1] ]

// your method should return the following map

//{Don=0 Goals, James=10 Goals, Jordan= 8 Goals, Kittle= 1 Goal, Londan= 2 Goals, Ory= 13 Goals} 


// notice how the keys in map are in sorted order. Also notice when a 
// player only has 1 goal the value it maps to is 1 Goal rather than goals.
// You may assume the list has one occurence of at least on value.
// And names and amount of goals will be seperated by :

// You may also assume values will be unique and no 2 players 
// with the same name will be given in the list.

// Your algrothim must run in 0(n) time and space complexity.
   public static Map<String, String> soccerGame(List<List<String>> gameResults){
   // Your code goes here
      List<String> gameInformation = new LinkedList<>();
      for(List<String> list: gameResults){
         gameInformation.addAll(list);
      }
      Map<String, String> map = new TreeMap<>();
      Iterator<String> inter = gameInformation.iterator();
      System.out.println(gameInformation);
      while(inter.hasNext()){
         String next = inter.next();
         String[] split = next.split(":");
         if(!map.containsKey(split[0])){
            if(split[1].equalsIgnoreCase("1")){
               map.put(split[0], split[1] + " Goal");
            }else{
               map.put(split[0], split[1] + " Goals");
            
            }
         }
      }
      return map;
   
   }

}
