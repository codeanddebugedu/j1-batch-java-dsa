import java.util.HashMap;

class LRUCache {
    private final int capacity;
    private final HashMap<Integer, Node> map;
    private final Node head, tail;

    // Node class for Doubly Linked List
    private static class Node {
        int key, value;
        Node prev, next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the LRU Cache with a fixed capacity
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(-1, -1); // Dummy head
        this.tail = new Node(-1, -1); // Dummy tail
        head.next = tail;
        tail.prev = head;
    }

    // Get the value associated with the key if present, else return -1
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1; // If key not found
        }
        Node node = map.get(key);
        moveToHead(node); // Mark as most recently used
        return node.value;
    }

    // Put the key-value pair into the cache
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            // Update the existing node and move it to the head
            Node node = map.get(key);
            node.value = value;
            moveToHead(node);
        } else {
            // Create a new node if the key doesn't exist
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addNode(newNode);
            
            // If cache exceeds capacity, remove the least recently used node
            if (map.size() > capacity) {
                Node tailNode = popTail();
                map.remove(tailNode.key); // Remove from map
            }
        }
    }

    // Add a node right after the head (most recently used)
    private void addNode(Node node) {
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    // Move an existing node to the head (mark as recently used)
    private void moveToHead(Node node) {
        removeNode(node);  // First, remove it from its current position
        addNode(node);     // Then, move it to the head
    }

    // Remove a node from the doubly linked list
    private void removeNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    // Pop the least recently used node (the node before the tail)
    private Node popTail() {
        Node lruNode = tail.prev;
        removeNode(lruNode);
        return lruNode;
    }

    // For debugging: Print the current cache status (optional)
    public void printCache() {
        Node current = head.next;
        while (current != tail) {
            System.out.print(current.key + "=" + current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */