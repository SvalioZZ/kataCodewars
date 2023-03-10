package codewars.kataexercises.ex9;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits
 * , each raised to the power of the number of digits in a given base. In this Kata,
 * we will restrict ourselves to decimal (base 10).
 * <p>
 * For example, take 153 (3 digits), which is narcissistic:
 * <p>
 * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * and 1652 (4 digits), which isn't:
 * <p>
 * 1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
 * The Challenge:
 * <p>
 * Your code must return true or false (not 'true' and 'false') depending
 * upon whether the given number is a Narcissistic number in base 10.
 * This may be True and False in your language, e.g. PHP.
 * <p>
 * Error checking for text strings or other invalid inputs is not required,
 * only valid positive non-zero integers will be passed into the function.
 */

public class NumberUtils {
    
    public static void main(String[] args) {
        System.out.println(isNarcissistic(112));
    }
    
//    public static boolean isNarcissistic(int number) {
//        String numberStr = String.valueOf(number);
//        int[] digits = new int[numberStr.length()];
//        int sum = 0;
//        for (int i = 0; i < numberStr.length(); i++) {
//            sum += Math.pow(Integer.parseInt(String.valueOf(numberStr.charAt(i))), numberStr.length());
//        }
//        return sum == number;
//    }
    public static boolean isNarcissistic(int number) {
        String numberStr = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
           sum += Math.pow(numberStr.charAt(i) - '0', numberStr.length());
        }
        return sum == number;
    }
}
