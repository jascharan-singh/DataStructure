public class Stack {
    private Node top;
    private int height;
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public Stack(int value){
        Node  list = new Node(value);
        top = list;
        height = 1;
    }
    public void printStack(){
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getTop(){
        System.out.println("Top: "+ top.value);
    }
    public void getHeight(){
        System.out.println("Height: "+ height);
    }
    public void push(int value){
        Node  list = new Node(value);
        if(height==0){
            top = list;

        }
        else{
            Node temp = top;
            top = list;
            top.next = temp;
        }
        height++;
    }
    public Node pop(){
        if (height==0){return null;}
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
}
