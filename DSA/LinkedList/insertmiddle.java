package Solutions.DSA.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    Node head;

    // Method to insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Method to insert a new node after a given position
    public void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);

        // If inserting at the head (position 0)
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 1; i <=position - 1; i++) {
            if (current == null) {
                throw new IllegalArgumentException("Position out of bounds");
            }
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
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
        LinkedList list = new LinkedList();
        
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        
        list.display(); // Output: 1 -> 2 -> 4 -> null

        list.insertAtPosition(2, 3); // Insert 3 at position 2
        
        list.display(); // Output: 1 -> 2 -> 3 -> 4 -> null
    }
}

