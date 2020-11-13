package _11_DSA_stark_queue.practise.stark_linked_list;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStark<T> {
    private LinkedList<T> stark;

    public MyGenericStark() {
        stark = new LinkedList<>();
    }

    public void push(T element) {
        stark.addFirst(element);
    }

    public T pop() {
        if (stark.isEmpty()) {
            throw new EmptyStackException();
        }
        return stark.removeFirst();
    }

    public int size() {
        return stark.size();
    }

    public boolean isEmpty() {
        if (stark.size() == 0) {
            return true;
        }
        return false;
    }
}
