public class QueueArray {
    private int[] array;
    private int front;
    private int rear;
    private int length;

    public QueueArray(int capacity) {
        array = new int[capacity];
        front = 0;
        rear = -1;
        length = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % array.length; // Circular increment to wrap around the array.
        array[rear] = value;
        rear++;
        length++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // You can choose to handle this case differently.
        }
        int value = array[front];
        front = (front + 1) % array.length; // Circular increment to wrap around the array.
        length--;
        return value;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == array.length;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int current = front;
        for (int i = 0; i < length; i++) {
            System.out.print(array[current] + " ");
            current = (current + 1) % array.length; // Circular increment to wrap around the array.
        }
        System.out.println();
    }

    public int getLength() {
        return length;
    }
}