package Solutions.DSA.12.StackQueue;

class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        
        StackNode newNode = new StackNode(a);
        if(top==null){
            top = newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }   

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        //System.out.println(top.data);
        if(top==null) return -1;
        StackNode topptr = top;
        top= top.next;
        return topptr.data;
    }
}
