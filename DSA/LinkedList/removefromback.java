package Solutions.DSA.LinkedList;

class removefromback 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode left = head;
        ListNode right = head;
        int i=1;
        while(right.next != null)
        {
            right = right.next;
            if(i>n)
                left = left.next;
            i++;
        }      
        if(i == n)
            return head.next;
        
        left.next = left.next.next;
        return head;
    }
}
