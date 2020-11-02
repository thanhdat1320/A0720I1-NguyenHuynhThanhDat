package b11_DSA_stark_queue.exercise.deploy_queue_round;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.displayQueue();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.enQueue(5);
        myQueue.deQueue();
        myQueue.displayQueue();
    }
}
