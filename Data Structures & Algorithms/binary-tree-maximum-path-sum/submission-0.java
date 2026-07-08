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
    int maxsum=0;
    public int maxPathSum(TreeNode root) {
        maxsum=Integer.MIN_VALUE;
        if(root==null)
        return 0;
        dfs(root);
        return maxsum;

        
    }
    public int dfs(TreeNode root){
        if(root==null)
        return 0;
        int left=Math.max(0,dfs(root.left));
        int right=Math.max(0,dfs(root.right));
        maxsum=Math.max(maxsum,(left+right+root.val));
        return Math.max(right,left)+root.val;
    }
}
