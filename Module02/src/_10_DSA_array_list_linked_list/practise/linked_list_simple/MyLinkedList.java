package _10_DSA_array_list_linked_list.practise.linked_list_simple;

public class MyLinkedList {
    private int numNotes;
    private Node head;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null ; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNotes++;
    }

    public void adFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNotes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
