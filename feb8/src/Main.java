import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static String defangIPaddr(String address) {
        String newString = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i)=='.'){
                newString = newString +"[.]" ;
            }
            else {
                newString = newString + address.charAt(i);
            }
        }
        return newString;
    }
    public int finalValueAfterOperations(String[] operations) {
        int num = 0;
        for(int i = 0; i< operations.length; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                num = num - 1;
            }
            else{
                num = num +1;
            }

        }
        return num;
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0; i < jewels.length(); i++){
            for(int j = 0;j < stones.length();j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
    public static int[] shuffle(int[] nums, int n) {
        int count = 0;
        int [] result = new int[nums.length];
        int i = 0;
        int j = n;
        while(i<n && j<nums.length) {
            result[count++] = nums[i++];
            result[count++] = nums[j++];
        }


        return result;
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x){
                    arr.add(i);
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
//        System.out.println(defangIPaddr("255.100.50.0"));
//        System.out.println(numJewelsInStones("aA", "aAABBBB"));
//        int [] num = {2,5,1,3,4,7};
//          System.out.println(Arrays.toString(shuffle(num, 3)));
        String [] myStrint = {"abc","bcd","aaaa","cbc"};

        System.out.println(findWordsContaining(myStrint, 'a'));
    }
}