public class HasPathTree{
  public IntTreeNode overallRoot;

/*  hasPathSum
Write a method called hasPathSum that takes an integer n as a parameter and
that returns true if there is some path from the overall root of a tree to a
node of the tree in which the sum of the data stored in the nodes adds up to n
 (returning false if no such path exists). For example if the variable t refers
 to the following tree:

                             +----+
                             |  5 |
                             +----+
                           /        \
                         /            \
                  +----+                +----+
                  |  1 |                | 21 |
                  +----+                +----+
                 /      \                     \
                /        \                     \
            +----+       +----+               +----+
            | -9 |       |  2 |               | 20 |
            +----+       +----+               +----+
           /      \                          /      \
          /        \                        /        \
      +----+      +----+                +----+      +----+
      |  3 |      | 30 |                | 13 |      |  4 |*
      +----+      +----+                +----+      +----+
      t.hasPathSum(8) returns true because of the path (5, 1, 2)
      t.hasPathSum(26) returns true because of the path (5, 21)
      t.hasPathSum(0) returns true because of the path (5, 1, -9, 3)
      t.hasPathSum(5) returns true because of the path (5)
      t.hasPathSum(1) returns false because no path with that sum exists
    */
   
   public boolean hasPathSum(int target){
      return hasPathSum(this.overallRoot, target, 0);
   }
   
   private boolean hasPathSum(IntTreeNode root, int target, int runningSum){
      if(runningSum == target){
         return true;
      }
      if(root != null){
         return hasPathSum(root.left, target, runningSum + root.data) ||
                hasPathSum(root.right, target, runningSum + root.data);
      }
      return false;
   }
  public static class IntTreeNode {
      public int data;
      public IntTreeNode left;
      public IntTreeNode right;
               
    // constructs a leaf node with given data
      public IntTreeNode(int data) {
         this(data, null, null);
      }
                       
    // constructs a branch node with given data, left subtree,
    // right subtree
      public IntTreeNode(int data, IntTreeNode left,
                       IntTreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
      }
   }
   }
