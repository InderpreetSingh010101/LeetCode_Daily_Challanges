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
class Solution {
    
    public void leafs(TreeNode root , ArrayList<Integer> l1 ){
        
        if(root.left == null && root.right == null ){
          l1.add(root.val) ;
            return  ; 
        }
        
       
        if(root.left != null && root.right != null){
            leafs(root.left , l1) ;
            leafs(root.right , l1) ;
        }else if(root.left != null){
            leafs(root.left , l1) ;
        }else{
            leafs(root.right , l1) ;
        }
        
        return ;
        
        
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        leafs(root1 , l1) ;
        leafs(root2 , l2) ;
        return (l1.equals(l2));
        
    }
}