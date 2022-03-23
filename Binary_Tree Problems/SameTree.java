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

/* Given the roots of two binary trees p and q, write a function to check if 
    they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value. */
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) throws RuntimeException{
       return  isSameTreeHelper(p, q);
    }
    
    public boolean isSameTreeHelper(TreeNode p, TreeNode q) throws RuntimeException{
        if(p == null && q == null){
            return true;
        }else if(p == null && q != null || q == null && p != null){
            return false;
        }else if(q.val != p.val){
            return false;
        }
            return isSameTreeHelper(p.left, q.left) && isSameTreeHelper(p.right, q.right);
    }
}
