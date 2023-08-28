class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        backTrack(candidates, new ArrayList<>(), result, target, 0);
        return result;
    }
    
    public static void backTrack(int[] array, List<Integer> explore, List<List<Integer>> result, int target, int index) {
        if(target == 0) {
            result.add(new LinkedList<>(explore));
        } 
        if(target > 0) {
            for(int i = index; i <= array.length - 1; i++) {
                explore.add(array[i]);
                backTrack(array, explore, result, target - array[i], i);
                explore.remove(explore.size() - 1);
            }
        }
      //  return;
    }
}