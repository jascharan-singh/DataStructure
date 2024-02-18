import java.math.BigInteger;
import java.util.HashSet;

class LinkedList{
    private Node head;
    private Node tail;
    private int lenght;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }

    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        lenght = 1;

    }

    public void getLength(){
        System.out.println("Length : " + lenght);
    }
    public Node printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        return temp;
    }
    public void append(int value){
        Node newNode = new Node(value);
        if (lenght==0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        lenght++;
    }
    public void getHead(){
        if(head == null){
            System.out.println("Head : null" );
        }
        else{
            System.out.println("Head : " + head.value);
        }
    }
    public void getTail(){
        if(tail == null){
            System.out.println("Head : null" );
        }
        else{
            System.out.println("Head : " + head.value);
        }
    }
    public Node removeLast(){
        if (lenght==0){
            return null;
        }
        Node temp = head;
        Node preTemp = head;
        while (temp.next!=null){

            preTemp = temp;
            temp = temp.next;

        }
        tail = preTemp;
        tail.next = null;
        lenght--;
        if(lenght==0){
            head = null;
            tail = null;
        }
        return temp;
    }
    public Node removeFirst(){
        if (lenght==0){return null;}
        Node temp = head;
        head = head.next;
        temp.next = null;
        lenght--;
        if (lenght==0){
            tail = null;
        }
        return temp;
    }
    public void prepend(int value) {
        Node newNode = new Node(value);
        if (lenght == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        lenght++;
    }
    public Node get(int index){
        if (index<0 ||index >=lenght){
            return null;
        }
        Node temp = head;
        for (int i = 0; i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        if (index<0 ||index >=lenght){
            return false;
        }
        Node temp = head;
        for (int i = 0; i<index;i++){
            temp = temp.next;
        }
        temp.value = value;
        return true;
    }
    public boolean insert(int index){
        if (index<0 ||index >lenght){
            return false;
        }
        if (index==0){
            prepend(value);
            return true;
        }
        if (index == lenght){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        lenght++;
        return true;


    }
    public Node remove(int index){
        if (index==0){
            lenght--;
            return removeFirst();

        }
        if (index == lenght){
            lenght--;
            return removeLast();

        }
        Node temp1 = get(index-1);
        Node temp3 = get(index);
        Node temp2 = get(index+1);
        temp1.next = temp2;

        temp3.next = null;
        lenght--;
        return temp3;

    }
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0;i<lenght;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;

        }
    }
    public Node findMiddleNode(){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
    public Node findKthFromEnd(int k){
        Node first = head;
        Node second = head;
        for (int i = 0;i<k;i++){
            if (first==null){return null;}
            first = first.next;

        }
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        return second;
    }
    public void removeDuplicates() {
        if (head == null || head.next == null) {
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            if (set.contains(temp.value)) {
                prev.next = temp.next;

            } else {
                set.add(temp.value);
                prev = temp;
            }
            temp = temp.next;


        }
    }
    public int binaryToDecimal() {
        int num = 0;
        int count = -1;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        Node temp2 = head;
        for (int i = count; i >= 0; i--){

            num = (int) (num + Math.pow(2,i)*temp2.value);
            temp2 = temp2.next;
        }
        return num;
    }
    public void reverseBetween(int a, int b){
        Node temp = head;

    }
    public int insertGreatestCommonDivisors(Node head) {
        Node temp = head;
        BigInteger num1 = new BigInteger(String.valueOf(temp.value));
        BigInteger num2 = new BigInteger(String.valueOf(temp.next.value));
        BigInteger gcdResult = num1.gcd(num2);
        int result  = gcdResult.intValue();
        return result;

    }

}



