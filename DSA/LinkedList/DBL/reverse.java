package Solutions.DSA.LinkedList.DBL;

public class reverse {
    public static Node reverseDLL(Node head) {
        // Your code here
        Node current = head;
        // Initialize a temporary node to swap pointers
        Node temp = null;

        // Traverse the list and swap next and prev pointers of each node
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // After the loop, temp will be pointing to the new head of the reversed list
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}
