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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root.left == null && root.right == null){
            if(root.val >= low && root.val <= high)
              return root.val ;
              else
              return 0 ;
        }


        int sum = 0 ;

        if(root.left != null && root.right != null){
            sum += rangeSumBST(root.left , low , high) + rangeSumBST(root.right , low , high); 
        }else if(root.left != null){
             sum += rangeSumBST(root.left , low , high) ;
        }else {
             sum += rangeSumBST(root.right , low , high) ;
        }

        if(root.val >= low && root.val <= high)
              sum +=root.val ;

     return sum ;

    }
}