import java.util.Queue;

public class ArrayQueue<E> {
    private E[] queue;
    private int size;
    private final int CAPACITY = 5;
    private int front;
    private int rear;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        queue = (E[]) new Object[CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    /**
     * This methods can also be called "add" or "offer".
     * Places an element at the end of the queue.
     * What is the runtime?
     * @param element
     */
    public void enqueue(E element) {
        if (size == CAPACITY) {
            resizeArray(CAPACITY*2);

        }
        queue[rear] = element;
        rear = (rear+1)% CAPACITY; // Circular increment to wrap around the array.
        size++;
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
        E element = queue[front];
        front = (front+1)% CAPACITY;
        size--;
        return element;
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
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
    private void resizeArray(int newCapacity) {
        E[] newQueue = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[(front + i) % (CAPACITY * 2)]; // Copy elements with circular access.
        }
        queue = newQueue;
        front = 0;
        rear = size;
    }


}
