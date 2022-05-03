public class DoubleTree{
  public IntTreeNode overallRoot;
/*  doubleIt
Write a method called double that creates two new nodes for each node in a
 binary tree of integers. Specifically, each node in the original tree will be
  given new left and right child nodes that each contain a value twice that of 
  its parent. The left child of the original node will be made the left child of 
  the new left child and the right child of the original node will be made the 
  right child of the new right child. Only nodes from the original tree will 
  be modified in this manner, do not continue modifying new nodes. For 
  example, suppose a variable t stores a reference to the following tree:

                             +----+
                             |  2 |
                             +----+
                           /        \
                         /            \
                  +----+               +----+
                  | -6 |               |  7 |
                  +----+               +----+
                        \                  
                         \                 
                        +----+             
                        | 23 |             
                        +----+   
After a call to double:

t.double();
The new tree should look like this:

                                   +----+
                                   |  2 |
                                   +----+
                                 /        \
                               /            \
                        +----+                +----+
                        |  4 |                |  4 |
                        +----+                +----+
                       /                            \
                      /                              \
                +----+                              +----+
                | -6 |                              |  7 |
                +----+                              +----+
               /      \                            /      \             
              /        \                          /        \     
          +----+      +----+                  +----+      +----+ 
          |-12 |      |-12 |                  | 14 |      | 14 | 
          +----+      +----+                  +----+      +----+ 
                            \              
                             \         
                           +----+      
                           | 23 |      
                           +----+
                          /      \      
                         /        \     
                     +----+      +----+ 
                     | 46 |      | 46 | 
                     +----+      +----+    
       
       */
       
   public void doubleIt(){
      this.overallRoot = doubleIt(overallRoot, false);
   }
       
   public IntTreeNode doubleIt(IntTreeNode root , boolean yes){
      if(root != null){
         if(yes){
            IntTreeNode temp = root.right;
            IntTreeNode temp2 = root.left;
            IntTreeNode current = new IntTreeNode(root.data + root.data, null, null);
            root.right = current;
            root.left = new IntTreeNode(root.data + root.data);
            root.right.right = temp;
            root.left.left = temp2;
         }else if(!yes){
            IntTreeNode temp = root.left;
            IntTreeNode temp2 = root.right;
            IntTreeNode current = new IntTreeNode(root.data + root.data, null, null);
            root.left = new IntTreeNode(root.data + root.data);
            root.right = current;
            root.left.left = temp;
            root.right.right = temp2;
         }
         root.left.left = doubleIt(root.left.left, false);
         root.right.right = doubleIt(root.right.right, true);
      }
      return root;
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
