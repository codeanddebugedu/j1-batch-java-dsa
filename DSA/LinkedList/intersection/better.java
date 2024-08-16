package Solutions.DSA.LinkedList.intersection;

public class better {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode a=headA,b=headB;
       Set<ListNode> seen  = new HashSet<>();
       while(a!=null){
           seen.add(a);
           a=a.next;
       }
    
       while(b!=null){
           if(!seen.add(b)) return b;
           b=b.next;
       }
       return null;
    }
}