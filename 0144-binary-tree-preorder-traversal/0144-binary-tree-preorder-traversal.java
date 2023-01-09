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
    
    public List<Integer> ls = new ArrayList<>() ;
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root == null)
            return ls ;
        
        List<Integer> a = new ArrayList<>() ;
        ls.add(root.val) ;
        
        a = preorderTraversal(root.left);
        a = preorderTraversal(root.right);
        
        return a;
        
        
    }
}