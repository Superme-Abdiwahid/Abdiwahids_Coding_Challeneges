class Valid{
    
    //-----------------------------------------------------------------------
    // Your task to write a method validAnagrams
    // which will be passed 2 strings. And your
    // job is to detrime wether 2 strings are considered to be valid angrams
    // a valid anagram would be if 2 strings contain the same amount of
    // letters in same or different placements to produce a valid word.
    
    // for example danger and garden are valid anagrams because
    // the words appear in different orders to produce a valid
    // anagram. The words jump and jack would not be a valid anagram
    // so your method should return false notice how the words in jump
    // dont appear in jack and vice versa though they are a valid word.
    // your task is to write a method to detrime if 2 words are valid anagrams.
    // Try to see if you can make your code run in an optimal solution.
    
    static boolean validAnagrams(String word1, String word2){
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i <= word1.length() - 1; ++i){
            if(!map.containsKey(word1.charAt(i))){
                map.put(word1.charAt(i), 1);
            }else{
                map.put(word1.charAt(i), map.get(word1.charAt(i) + 1));
            }
        }
        
        for(int i = 0; i <= word2.length() - 1; ++i){
            if(!map2.containsKey(word2.charAt(i))){
                map2.put(word2.charAt(i), 1);
            }else{
                map2.put(word2.charAt(i), map2.get(word2.charAt(i) + 1));
            }
        }
        
        return Objects.equals(map, map2);
    }
}
