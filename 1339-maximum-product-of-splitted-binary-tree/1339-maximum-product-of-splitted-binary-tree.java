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
    
    private long totalS = 0 ;
    private long maxP = 0  ;
    
    public void sumDfs(TreeNode root){  // calculating sum of full tree
        if(root == null)
            return  ;
      
        sumDfs(root.left) ;
        sumDfs(root.right) ;
        
        totalS += root.val ;
    }
    
    public int cutDfsP(TreeNode root){     // AT each node we chk the tsum at that pt and 
        if(root == null)                   // do tsum * (totalsum - tsum) and chk for max
            return 0;
        
        int l  = cutDfsP(root.left) ;
        int r  = cutDfsP(root.right) ;
        
        int subSum = l + r + root.val ;
        maxP = Math.max(maxP , (subSum * (totalS-subSum)));
        
        return subSum ;
    }
    public int maxProduct(TreeNode root) {
        sumDfs(root) ;
        cutDfsP(root) ;
        
        return (int) (maxP % ((int) Math.pow(10,9) + 7 )) ; // as given in ques 
    }              // Since the answer may be too large, return it modulo 109 + 7.
}