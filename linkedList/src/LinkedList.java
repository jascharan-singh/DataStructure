

public class LinkedList<T> {
    //---------------------Nested Node Class---------------------//
    public class Node<T> {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
        public void setNodeData(T data) { this.data = data; }
        public void setNodeNext(Node next) { this.next = next; }

        public T getNodeData() { return this.data; }
        public Node getNodeNext() { return this.next; }
    }
    //-----------------------------------------------------------//

    private Node dummyhead;
    private Node tail;
    private int length;

    public LinkedList() {

    }

    public void insertFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = dummyhead.next;
        dummyhead.next = newNode;
        tail = tail.next;
        this.length = length + 1;
    }

    public void insertLast(T data) {
        Node<T> newNode = new Node<>(data);
        tail.next = newNode;
        tail = tail.next;
        this.length++;
    }

    public void insertAtPosition(T data, int pos) {
        if (pos == 0){
            insertFirst(data);
        }
        else if (pos>=length){
            insertLast(data);
        }
        else{
            Node <T> node = new Node<>(data);
            Node <T> curr = this.dummyhead.next;
            for (int i = 0; i < pos; i++) {
                curr = curr.next;
                curr.next = node;
                node.next = curr.next;
            }
            this.length++;
        }

    }

    public void removeFirst() {
        if (length == 0){return;}
        dummyhead = dummyhead.next.next;
        length--;
    }

    public void removeLast() {
        if (this.length==0){return;}
        else if (this.length==1) {
            this.dummyhead = null;
            this.tail = dummyhead;
        }
        else {
            Node<T> curr = this.dummyhead;
            while (curr.next.next!=null){
                curr = curr.next;
            }
            curr.next = curr.next.next;
            this.tail = curr;
        }
        this.length--;

    }

    public void removeAtPosition(int pos) {
        if (length == 0||pos>length){
            return;
        }
        else if (pos ==0){
            this.removeFirst();
        }
        else if (pos == length){
            this.removeLast();
        }
        else {
            Node<T> curr = this.dummyhead;
            for (int i = 0; i < pos; i++) {
                curr = curr.next;
            }
            curr = curr.next.next;
        }
        this.length--;
    }

    public boolean isPresent(Node n) {
        Node<T> curr = dummyhead.next;
        while (curr!=null){
            if (n == curr){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public boolean isEmpty() {
        if (length==0){
            return true;
        }
        return false;
    }

    public Node getFirst() {
        return this.dummyhead.next;
    }

    public Node getLast() {
        return this.tail;
    }

    public int getLength() {
        return this.length;
    }
    public void print() {
        Node<T> curr = this.dummyhead.next;
        while(curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println(this.length);
    }

}
