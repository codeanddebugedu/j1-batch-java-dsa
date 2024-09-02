class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        top++;
        if(top>=0){
        arr[top] = x;
        }
    }

    public int pop() {
        // Your Code
        int x=-1;
        if(top>=0) {
            x=arr[top];
            top--;
        }
        return x;
    }
}