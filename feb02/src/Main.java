public class Main {
    public static int differenceOfSums(int n, int m) {
        int result1 = 0;
        int result2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i%m==0){


                result1+=i;
            }
            else {

                result2+=i;
            }

        }
        return result2 - result1;
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        System.out.println(differenceOfSums(5,6));
    }
}