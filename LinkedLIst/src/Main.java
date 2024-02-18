import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        cookie cookieOne = new cookie("Green");
//        cookie cookieTwo = new cookie("blue");
//        cookieTwo.setColor("Yellow");
//        System.out.println(cookieOne.getColor());
//        System.out.println(cookieTwo.getColor());

        // ****************Note*******************************************
        //LinkedList code:
        LinkedList myLinkedList = new LinkedList(18);
        myLinkedList.append(6);
        myLinkedList.append(10);
        //System.out.println(Math.pow(2,2));
        myLinkedList.append(3);
//        myLinkedList.append(4);
//        myLinkedList.append(2);
//        myLinkedList.append(5);
//        myLinkedList.append(5);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
        //  myLinkedList.getLength();
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());

//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst());
//          System.out.println(myLinkedList.set(3,500));
        //myLinkedList.insert(1,1);
//        System.out.println(myLinkedList.remove(1).value);
//        System.out.println(myLinkedList.remove(2).value);
//        System.out.println(myLinkedList.remove(0).value);
//          System.out.println("\nLinked List:");
//          myLinkedList.reverse();
//        System.out.println(myLinkedList.get(10).value);
//        myLinkedList.removeDuplicates();
        myLinkedList.printList();
        LinkedList linkedList = new LinkedList(18);
        linkedList.insert(6);
        linkedList.insert(10);
        linkedList.insert(3);
        int number = getClass(linkedList.getHead());

        // System.out.println(myLinkedList.binaryToDecimal());


//        System.out.println(myLinkedList.findMiddleNode().value);
//        System.out.println(myLinkedList.findKthFromEnd(6));

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */
    }
}