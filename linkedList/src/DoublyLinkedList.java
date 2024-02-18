public class DoublyLinkedList<T> {
    //---------------------Nested Node Class---------------------//
    public class Node<T> {
        private T data;
        private Node prev;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        public T getNodeData() {return this.data;}
        public Node getNodePrev() {return this.prev;}
        public Node getNodeNext() {return this.next;}

        public void setNodeData(T data) {this.data = data;}
        public void setNodePrev(Node prev) {this.prev = prev;}
        public void setNodeNext(Node next) {this.next = next;}
    }
    //-----------------------------------------------------------//

    private Node dummyhead;
    private Node tail;
    private int length;

    public DoublyLinkedList() {

    }

    public void insertFirst(T data) {
        return;
    }

    public void insertLast(T data) {

    }

    public void insertAtPosition(T data, int pos) {

    }

    public void removeFirst(T data) {

    }

    public void removeLast(T data) {

    }

    public void removeAtPosition(T data, int pos) {

    }

    public boolean isPresent(Node n) {
        return true;
    }

    public boolean isEmpty() {
        return true;
    }

    public Node getFirst() {
        return null;
    }

    public Node getLast() {
        return null;
    }

    public int getLength() {
        return -1;
    }

    public T[] toArray() {
        return null;
    }

    public T[] toArrayInverse() {
        return null;
    }

}
