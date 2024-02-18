public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBst = new BinarySearchTree();
        myBst.insert(47);
        myBst.insert(21);
        myBst.insert(76);
        myBst.insert(18);
        myBst.insert(52);
        myBst.insert(82);
        myBst.insert(27);
        System.out.println(myBst.contain(27));
        System.out.println(myBst.contain(17));
    }
}