package _11_DSA_stark_queue.exercise.deploy_queue_round;

public class MyQueue {
    private Node font = null;
    private Node rear = null;

    public MyQueue() {
    }

    public void enQueue(int element) {
        Node temp = new Node(element);
        if (font == null) {
            font = rear = temp;
            font.link = rear;
            rear.link = font;
        } else {
            rear.link = temp;
            rear = temp;
            rear.link = font;
        }
    }

    public Node deQueue() {
        if (font == null) {
            return null;
        } else if (font == rear) {
            Node temp = font;
            font = rear = null;
            return temp;
        } else {
            Node temp = font;
            font = font.link;
            rear.link = font;
            return temp;
        }
    }

    public void displayQueue() {
        if (font == null) {
            System.out.println("Null");
        } else {
            Node temp = font;
            while (temp != rear) {
                System.out.println(temp.data);
                temp = temp.link;
            }
            System.out.println(rear.data);
        }
    }

}
