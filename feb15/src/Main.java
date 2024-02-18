import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] num = {{1,5},{7,3},{3,5}};
       // System.out.println(maximumWealth(num));
        System.out.println(smallestEvenMultiple(101));
    }
    public static int maximumWealth(int[][] accounts) {
        int[] num = new int [accounts.length];
        int count = 0;
        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                result+=accounts[i][j];
            }
            num[count++]= result;
            result = 0;
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        return num[num.length-1];
    }
    public static int smallestEvenMultiple(int n) {
        int result = 0;
        int i =1;
        while (true){
            if (i%2 == 0 && i%n == 0){
                result = i;
                break;

            }
            i++;
        }

        return result;
    }
}