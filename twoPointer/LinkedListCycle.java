public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode node = head;
        List<ListNode> nums = new ArrayList<>();
        while(node.next != null){
            System.out.println(node.val);
            if(nums.contains(node)) {
                return true;
            }
            nums.add(node);
            node = node.next;
        }
        
        return (node.next != null);
    }
}
