
import java.util.Arrays;

public class Main {
    public static int[] numberGame(int[] nums) {
    int [] result = new int[nums.length];
        Arrays.sort(nums);
        int alice = 0;
        int bob = 1;
        int count = 0;
        int iterator = nums.length/2;
        int n =0;
        while(n<iterator){
            result[count++] = nums[bob];
            result[count++] = nums[alice];
            bob = bob+2;
            alice = alice+2;
            n++;
        }
    return result;
    }
    public static void main(String[] args) {
        int [] nums = {5,4,2,3};
        System.out.println(Arrays.toString(numberGame(nums)));
    }
}