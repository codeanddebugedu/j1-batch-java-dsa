package Solutions.DSA.LinkedList;

class MyLinkedList {
    Node head;
    int length;
    public class Node{
        int val;
        Node next;

        Node(int val)
        {
            this.val = val;
        }
    }
    public MyLinkedList() {
        this.head=null;
        this.length=0;
    }
    
    public int get(int index) {
        if(index >= length)
        	return -1;
        int counter = 1;
        Node temp = head;
        while(counter<=index) {
        	counter++;
        	temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) 
    {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        length++;
    }
    
    public void addAtTail(int val) {
        if(head == null)
            addAtHead(val);
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp=temp.next;
            }
            Node newnode = new Node(val);
            temp.next = newnode;
            length++;
        }
    }
    
    public void addAtIndex(int index, int val) 
    {
        if(index>length)
            return;
        if(index == 0)
            addAtHead(val);
        else
        {
            int counter = 1;
            Node temp = head;
            while(counter < index)
            {
                temp = temp.next;
                counter++;
            }
            Node newnode = new Node(val);
            newnode.next=temp.next;
            temp.next=newnode;
            length++;
        }    
    }
    
    public void deleteAtIndex(int index) 
    {
        if(index>=length)
            return;
        if(index == 0)
        {
            head = head.next;
            length--;
        }    
        else
        {
            int counter = 1;
            Node temp = head;
            while(counter < index)
            {
                counter++;
                temp=temp.next;
            }
            temp.next=temp.next.next;
            length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */