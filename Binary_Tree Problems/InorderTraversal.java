/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root)throws RuntimeException{
     
        return inorderTraversal(root, new LinkedList<>());
  
    }
    
    
    public List<Integer> inorderTraversal(TreeNode root, List<Integer> list)throws RuntimeException{
        if(root != null){
            if(root.left == null && root.right == null){
                list.add(root.val);
            }else{
                list = inorderTraversal(root.left, list);
                list.add(root.val);
                list = inorderTraversal(root.right, list);
            }
        }
        return list;
    }
    
    
 
    
     
}
