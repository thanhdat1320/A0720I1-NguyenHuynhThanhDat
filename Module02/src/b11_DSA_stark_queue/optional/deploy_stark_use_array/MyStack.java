package b11_DSA_stark_queue.optional.deploy_stark_use_array;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack() {
    }

    public MyStack(int size) {
        this.size = size;
        arr = new int[this.size];
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = data;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null.");
        }
        return arr[--index];
    }

    public int size() {
        return this.index;
    }
}
