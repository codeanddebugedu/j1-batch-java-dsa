package Solutions.DSA.LinkedList;

class Node {
    int data;
    Node next;
    // Constructor with both data and next node
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }
    // Constructor with only data (assumes next is null)
    Node(int data1) {
        data = data1;
        next = null;
    }
}
class Traversal
{
    public static void main(String[] args) 
    {
        // Initializing an array
        int[] arr = {2, 5, 8, 7};
        // Creating a linked list manually
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        // Traversing the linked list and printing data
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
