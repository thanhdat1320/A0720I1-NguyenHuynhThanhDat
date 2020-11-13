package _11_DSA_stark_queue.practise.queue_linked_list;

public class MyLinkedListQueue {

    private Node head = null;
    private Node tail = null;

    public MyLinkedListQueue() {
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }
}
