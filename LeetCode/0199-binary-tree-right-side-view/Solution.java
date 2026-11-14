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
    List<Integer> ans=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        backtrack(root,0);
        return ans;
        
        
    }
    void backtrack(TreeNode node ,int depth ){
        if(node==null)return;
        if(depth==ans.size())ans.add(node.val);
        backtrack(node.right,depth+1);
        backtrack(node.left,depth+1);
     }
}