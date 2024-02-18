import java.util.LinkedList;

public class ListStack<E> {
    private LinkedList<E> stack;


    @SuppressWarnings("unchecked")
    public ListStack() {
        stack = new LinkedList<>();
    }

    /**
     * Places an element at the top of the stack.
     * What is the runtime?
     * @param element
     */
    public void push(E element) {
        stack.addLast(element);
    }

    /**
     * Removes the element at the top of the stack.
     * If stack is empty, it returns null.
     * What is the runtime?
     * @return E
     */
    public E pop() {
        if (isEmpty()){return null;}
        E element = stack.removeLast();
        return element;
    }

    /**
     * Returns but does not remove the element at the top of the stack.
     * If stack is empty, it returns null.
     * What is the runtime?
     * @return E
     */
    public E peek() {
        if (isEmpty()){return null;}
        E element = stack.getLast();
        return element;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
