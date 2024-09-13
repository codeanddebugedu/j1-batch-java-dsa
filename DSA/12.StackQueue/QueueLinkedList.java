package Solutions.DSA.12.StackQueue;

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode temp=new QueueNode(a);
        if(front==null)
        {
            front=temp;
            rear=temp;
        }
        else
        {
            rear.next=temp;
            rear=temp;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null) return -1;
        int val=front.data;
        front=front.next;
        return val;
	}
}
