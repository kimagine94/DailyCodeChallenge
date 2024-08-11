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
        Queue<TreeNode> pq = new LinkedList<>();
        Queue<TreeNode> qq = new LinkedList<>();

        pq.offer(p);
        qq.offer(q);

        while(!pq.isEmpty() && !qq.isEmpty()){
            TreeNode node1 = pq.poll();
            TreeNode node2 = qq.poll();

            if(node1 == null && node2 == null) continue;
            if(node1 == null || node2 == null || node1.val != node2.val) return false;
            pq.offer(node1.left);
            pq.offer(node1.right);
            qq.offer(node2.left);
            qq.offer(node2.right);
        }
        return true;
    }
}
