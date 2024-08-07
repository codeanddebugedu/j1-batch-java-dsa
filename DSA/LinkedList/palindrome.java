package Solutions.DSA.LinkedList;

class palindrome 
{
    public boolean isPalindrome(ListNode head) 
    {
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }     
        if(fast!=null)
            slow=slow.next;
        slow = reverse(slow);
        fast=head;
        while(slow!=null)
        {
            if(fast.val != slow.val)
                return false;
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        while(head!=null)
        {
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
