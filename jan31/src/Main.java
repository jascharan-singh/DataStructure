import java.util.HashMap;
import java.util.Objects;

public class Main {

    public static int addDigits(int num) {
    String numString = String.valueOf(num);
        if (numString.length()==1){
            return num;
        }
        int result = 0;
        for (int i = 0; i < numString.length(); i++) {
            int intNum = Character.getNumericValue(numString.charAt(i));
            result = result + intNum;
        }

        return addDigits(result);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer, Integer> myHasmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (myHasmap.containsKey(arr[i])){
                myHasmap.put(arr[i], myHasmap.get(arr[i])+1);
            }
            else{
                myHasmap.put(arr[i], 1);
            }

        }
        for (int i : myHasmap.keySet()){
            for (int j : myHasmap.keySet()){
                if (i !=j &&Objects.equals(myHasmap.get(i), myHasmap.get(j))){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int num = 38;
//        System.out.println(addDigits(num));
        int [] num = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(num));
    }
}

