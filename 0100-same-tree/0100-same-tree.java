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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
        return true;
        if(q==null || p==null)
        return false;
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.add(p);
        q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode t1=q1.poll();
            TreeNode t2=q2.poll();
            if(t1.val!=t2.val){
                return false;
            }
            if((t1.left==null)!=(t2.left==null))
            return false;
            if((t1.right==null)!=(t2.right==null))
            return false;
            if(t1.left!=null){
                q1.add(t1.left);
            }
            if(t1.right!=null){
                q1.add(t1.right);
            }
            if(t2.left!=null){
                q2.add(t2.left);
            }
            if(t2.right!=null){
                q2.add(t2.right);
            }
        }
        return true;
    }
}