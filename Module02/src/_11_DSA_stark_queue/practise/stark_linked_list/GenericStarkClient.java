package _11_DSA_stark_queue.practise.stark_linked_list;

public class GenericStarkClient {
    public static void starkOfString() {
        MyGenericStark<String> stark = new MyGenericStark<>();
        stark.push("Five");
        stark.push("four");
        stark.push("Three");
        stark.push("Two");
        stark.push("One");
        System.out.println("size after push: " + stark.size());

        while (!stark.isEmpty()) {
            System.out.println(stark.pop());
        }
        System.out.println("size after pop: " + stark.size());
    }

    private static void starkOfInteger() {
        MyGenericStark<Integer> stark = new MyGenericStark<>();
        stark.push(5);
        stark.push(4);
        stark.push(3);
        stark.push(2);
        stark.push(1);
        System.out.println("size after push: " + stark.size());

        while (!stark.isEmpty()) {
            System.out.println(stark.pop());
        }
        System.out.println("size after pop: " + stark.size());

    }

    public static void main(String[] args) {
        starkOfString();
        System.out.println("=========");
        starkOfInteger();
    }
}
