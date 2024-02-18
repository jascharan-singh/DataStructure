import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] nums = {4,2,1,1,2};
//        System.out.println(kidsWithCandies(nums, 1));
//        System.out.println(interpret("(al)G(al)()()G"));
        List<Integer> myList = new ArrayList<>();
        myList.add(-6);
        myList.add(2);
        myList.add(5);
        myList.add(-2);
        myList.add(-7);
        myList.add(-1);
        myList.add(3);
        System.out.println(countPairs(myList, -2));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int [] newArray = new int[candies.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = candies[i];
        }

        List<Boolean>myList = new ArrayList<>();
        Arrays.sort(newArray);
        int target = newArray[newArray.length-1];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >=target){
                myList.add(true);
            }
            else {
                myList.add(false);
            }
        }

        return myList;
    }
    public static String interpret(String command) {
        String result = "";
        for (int i = 0; i < command.length(); i++) {
            if (i < command.length() - 1 && command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result += 'o';
                i++;
            } else if (command.charAt(i) == '(' && i < command.length() - 1 && command.charAt(i + 1) != ')') {
                result += command.charAt(i + 1);
                i++;
            } else if (i == command.length() - 1 && command.charAt(i) == ')') {

            } else {
                result += command.charAt(i);
            }
        }
        return result;
    }
    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.size();i++ ){
            for (int j = i+1; j < nums.size(); j++) {


                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }

        }
            return count;
    }
}