package Solutions.DSA.LinkedList;

class reversek 
{
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode nextHead=head;
        int count=0;
        while(nextHead != null && count != k)
        {
            nextHead=nextHead.next;
            count++;
        }
        if(count!=k)
            return head;
        
        ListNode newHead=reverseKGroup(nextHead,k);
        while(count-- >= 1)
        {
            ListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }
}
