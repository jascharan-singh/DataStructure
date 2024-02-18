import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class subarraySum {

    public static List removeDuplicates(List<Integer> myList){
        HashSet<Integer> set = new HashSet<>(myList);
        return new ArrayList(set);
    }


    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target){
        List<int[]> myList = new ArrayList<>();
        HashSet <Integer> set = new HashSet<>();
        int count = 0;
        for (int j : arr1) {
            set.add(j);
        }
        for (int element : arr2){
            if (set.contains(element-target) ){
                int[]pair = {element-target, element};
                myList.add(pair);
            }
        }
        return myList;
    }



    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        System.out.println(pairs);
    }

}
