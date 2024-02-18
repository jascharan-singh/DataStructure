

public class MinHeap {
    int[] heapArray;
    int size;
    int capacity;

    public MinHeap() {
        capacity = 20;
        size = 1;
        heapArray = new int[capacity];
    }

    public MinHeap(int cap) {
        capacity = cap;
        size = 1;
        heapArray = new int[capacity];
    }

    /**
     * Insert in the min-heap array and heapify-up
     * @param num
     */
    public void insertMinHeap(int num) {
        //TODO
    }

    /**
     * Remove the min value from the min-heap
     * and heapify-down
     * @return
     */
    public int removeMinHeap() {
        //TODO
        return -1;
    }

    /**
     * Once a value is inserted, make sure it's on the right spot.
     * Move it up in necessary.
     * @param index
     */
    public void heapifyUp(int index) {
        //TODO
    }

    /**
     * Once the min (root) is removed, replace the root with the last node.
     * Move root down if necessary.
     //	 * @param index
     //	 */////
    public void heapifyDown() {
        //TODO
    }

    /**
     * Helper method two swap two nodes in the heap array.
     * @param i
     * @param j
     */
    public void swap(int i, int j) {
        //TODO
    }

    /**
     * Give a string representation of the heap array
     * Example: [1,2,3,4,5]
     */
    public String toString() {
        //TODO
        return null;
    }
}
