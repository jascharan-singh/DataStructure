import java.util.ArrayList;
import java.util.HashMap;

public class HT_interviewQuestions {


    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHasMap = new HashMap<>();
        for (int i : array1) {
            myHasMap.put(i, true);
        }
        for (int j : array2) {
            if (myHasMap.get(j) != null) return true;
        }


        return false;
    }

    public ArrayList findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i : map.keySet()) {
            if (map.get(i) > 1) {
                list.add(i);
            }
        }
        return list;
    }

    public Character firstNonRepeatingChar(String letter) {
        String letters = letter;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < letters.length(); i++) {
            if (map.containsKey(letter.charAt(i))) {
                map.put(letter.charAt(i), map.get(letter.charAt(i)) + 1);
            } else {
                map.put(letter.charAt(i), 1);
            }
        }
        for (int i = 0; i < letter.length(); i++) {
            char c = letter.charAt(i);
            if (map.get(c) == 1) {
                return c; // Found the first non-repeating character
            }
        }

        return null;
    }


}