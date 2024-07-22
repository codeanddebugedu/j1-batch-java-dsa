package Solutions.DSA.LinkedList;

class Solution 
{
    public ListNode middleNode(ListNode head) 
    {
        ListNode ptr= head;
        int count = 0;
        while(ptr != null)
        {
            ptr = ptr.next;
            count++;
        }    
        ListNode current = head;
        for(int i=0;i<count/2;i++)
        {
            current=current.next;
        }
        return current;
    }
}