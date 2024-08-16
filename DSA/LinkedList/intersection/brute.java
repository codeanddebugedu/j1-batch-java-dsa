package Solutions.DSA.LinkedList.intersection;

public class brute {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode a=headA,b;
        while(a!=null){
            b = headB;
            while(b!=null){
              if(a == b) return a;
              b = b.next;
            }
            a = a.next;
        }
        return null;
    }
}