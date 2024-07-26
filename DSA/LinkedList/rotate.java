package Solutions.DSA.LinkedList;

class Solution 
{
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null)
            return null;
        int i,size=1;
        ListNode fast=head,slow=head;
        while(fast.next!=null)
        {
            size++;
            fast=fast.next;
        }
        for(i=1;i<size-k%size;i++)
        {
            slow=slow.next;
        }
        fast.next=head;
        head=slow.next;
        slow.next=null;

        return head;
    }
}

