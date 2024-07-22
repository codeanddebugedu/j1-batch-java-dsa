package Solutions.DSA.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Insert1 {
    Node head;

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the linked list is empty, then make the new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // Else traverse till the last node and insert the new node there
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Insert the new node at the end of the list
        last.next = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Insert1 list = new Insert1();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        
        list.display(); // Output: 1 -> 2 -> 3 -> null
    }
}
