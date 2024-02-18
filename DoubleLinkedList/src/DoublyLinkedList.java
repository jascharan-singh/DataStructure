public class DoublyLinkedList {
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int length;
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;

    }
    public void getHead(){
        System.out.println("Head "+ head.value);
    }
    public void getTail(){
        System.out.println("Tail "+ tail.value);
    }
    public void getLength(){
        System.out.println("Length " + length);
    }
    public void append (int data){
        Node newNode = new Node(data);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    public void printList(){
        Node curr = head;
        while(curr !=null){
            System.out.println(curr.value);
            curr = curr.next;
        }
    }
    public Node removeLast(){
        if (length == 0){return null;}
        Node temp = tail;
        if (length ==1){
            head = null;
            tail = null;
        }
        else {

            tail = temp.prev;
            tail.next = null;

        }
        length--;
        return temp;

    }
    public void prepend(int data){
        Node newNode = new Node(data);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            Node temp = head;
            temp.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        Node temp = head;
        if (length == 0){
            return null;
        }
        if (length == 1){
            head = null;
            tail = null;
        }
        else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
    public Node get(int index){
        if (index<0||index>=length){
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        if (index< 0||index>length){
            return false;
        }
        else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.value = value;
            return true;
        }
    }
    public boolean insert(int index, int value){
        Node newNode = new Node(value);
        if (index<0||index>length){return false;}
        if (length == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        else{
            Node before = get(index-1);
            Node after = before.next;
            before.next = newNode;
            newNode.prev = before;
            newNode.next = after;
            after.prev = newNode;
            length++;
            return true;
        }


    }
    public Node remove(int index){
        if (index<0||index>=length){return null;}
        if (index == 0){removeFirst();}
        if (index == length-1){removeLast();}
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;

    }
}
