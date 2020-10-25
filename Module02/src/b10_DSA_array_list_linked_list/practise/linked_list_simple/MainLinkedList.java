package b10_DSA_array_list_linked_list.practise.linked_list_simple;

public class MainLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.adFirst(11);
        ll.adFirst(12);
        ll.adFirst(13);

        ll.add(4, 9);
        ll.add(4, 9);
        ll.printList();

    }
}
