package codewars.kataexercises.ex6;

import java.util.Arrays;

public class reverseArray {
    
    
    public static void main(String[] args) {
    
        System.out.println(Arrays.toString(digitize(3452567)));
    }
    /**
     * Given a random non-negative number, you have to return
     * the digits of this number within an array in reverse order.
     *
     */
    public static int[] digitize(long n) {
        String s = String.valueOf(n);
        int[] result = new int[s.length()];
        for (int i = 0; i <= result.length; i++){
            result[i] = (s.charAt(s.length() - i - 1) - '0');
        }
        return result;
    }
    
}
