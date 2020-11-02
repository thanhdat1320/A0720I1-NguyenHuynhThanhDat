package b11_DSA_stark_queue.optional.deploy_queue_use_array;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;

    public MyQueue() {
    }

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(int data) {
        if (isQueueFull()) {
            System.out.println("FULL!");
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = data;
            currentSize++;
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("EMPTY");
        } else {
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
