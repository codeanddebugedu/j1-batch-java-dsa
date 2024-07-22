package Solutions.DSA.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
class LinkedList
{
    private static Node convertarr2LL(int[] arr)
    {
        Node head= new Node(arr[0]);
        Node mover=head;
        for (int i=1;i<arr.length;i++)
        {
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover=mover.next;
        }
        return head;
    }
    public static void main(String[] args)
    {
        int[] arr={2,5,8,7};
        Node head=convertarr2LL(arr);
        System.out.print(head.data);
    }
}
