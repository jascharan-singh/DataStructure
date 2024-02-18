//import java.util.Arrays;
//import java.util.HashSet;
//
//public class Main {
//    public static int secondHighest(String s) {
//        String numericValue  = s.replaceAll("\\D", "");
//        int[] result = new int[numericValue.length()];
//        HashSet <Integer> set = new HashSet<>();
//        Arrays.fill(result, -1);
//        int count = 0;
//        for (int i = 0; i < numericValue.length(); i++) {
//            char k = numericValue.charAt(i);
////            int kToInt = Integer.parseInt(String.valueOf(k));
//            if(!set.contains(kToInt)){
//                set.add(kToInt);
//                result[count++] = kToInt;
//            }
//
//        }
////        Arrays.sort(result);
//        return result;
//    }
//    public static void main(String[] args) {
//        String mixedString = "dfa12321afd";
//        System.out.println((Arrays.toString(secondHighest(mixedString))));
//
//    }
//}
