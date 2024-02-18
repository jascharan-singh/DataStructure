import java.security.Key;
import java.util.HashMap;

public class Main {

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int result= -1;
        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(nums[i])){
                myMap.put(nums[i], myMap.get(nums[i])+1);
            }
            else {
                myMap.put(nums[i], 1);
            }
            for (int key: myMap.keySet()){
                if (myMap.get(key) == 1){
                    result = key;
                }
            }
        }
        return result;
    }
    public static void moveZeroes(int[] nums) {

    }
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}