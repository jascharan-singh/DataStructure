import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static String removeDigit(String number, char digit) {
        String result = "";
        boolean bol  = true;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != digit ){
               result = result+ number.charAt(i) ;
            }
            else{
                digit = 'A';
            }

        }

        return result;
    }

    public static int reverseInteger(int number){
        String numberString = String.valueOf(number);
        String numberChar = "";
        for (int i = numberString.length()-1; i >=0; i--) {
            numberChar = numberChar + numberString.charAt(i);

        }
        int result = Integer.parseInt(numberChar);
        return result;
    }
    public static void main(String[] args) {
    String num = "133235";
    char digit = '3';
    int[] num1 = {1,2,3};
    int[] num2 = {2,4,6};
    int number = 123;
    System.out.println(reverseInteger(number));
    }
}