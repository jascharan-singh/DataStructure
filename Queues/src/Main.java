public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);
//        myQueue.getfirst();
//        myQueue.getLast();
//        myQueue.getLength();
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());
        //myQueue.printQueue();
    }
}