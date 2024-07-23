package Solutions.DSA.LinkedList.DetectCycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast)
            {
                System.out.println(slow.val);
                return true;
            }
        }
        return false;
    }
}