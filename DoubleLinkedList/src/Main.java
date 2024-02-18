public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDll = new DoublyLinkedList(1);

//        myDll.getLength();
        myDll.append(2);
//        System.out.println(myDll.removeLast());

        myDll.prepend(0);
//        myDll.prepend(23);
//        myDll.removeFirst();
//        myDll.getHead();
//        myDll.getTail();
//        System.out.println(myDll.get(2).value);
       // System.out.println( myDll.set(0,23));
        //myDll.remove(1);
        myDll.printList();
        myDll.insert(3,500);
        myDll.remove(2);
        myDll. printList();

    }
}