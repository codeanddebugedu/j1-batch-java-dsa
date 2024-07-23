package Solutions.DSA.LinkedList.DetectCycle;

class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode current = head;
        while(current != null)
        {
            if(visited.contains(current))
                return true;
            visited.add(current);
            current = current.next;
        }    
        return false;
    }
}
