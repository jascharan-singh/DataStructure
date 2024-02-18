import java.util.LinkedList;

public class ListQueue<E> {
    LinkedList<E> queue;
    //capacity is not necessary
    //size can be implied by the list's length
    //front and rear can be implied by list's head and tail

    public ListQueue() {
        queue = new LinkedList<>();

    }

    /**
     * This methods can also be called "add" or "offer".
     * Places an element at the end of the queue.
     * What is the runtime?
     * @param element
     */
    public void enqueue(E element) {
    queue.addLast(element);
    }

    /**
     * This methods can also be called "pop" or "remove".
     * Removes the element at the front of the queue.
     * If queue is empty, it returns null.
     * What is the runtime?
     * @return E
     */
    public E dequeue() {
        if (isEmpty()){return null;}
        E elemet = queue.removeFirst();
        return elemet;
    }

    /**
     * This methods can also be called "peek" or "element".
     * Returns but does not remove the element at the front of the queue.
     * If queue is empty, it returns null.
     * What is the runtime?
     * @return E
     */
    public E front() {
        if (isEmpty()){return null;}
        E element = queue.getFirst();
        return element;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
