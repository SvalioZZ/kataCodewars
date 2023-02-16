package codewars.kataexercises.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
 *
 * Return your answer as a number.
 */
public class sumMixedArray {
   
    public static void main(String[] args) {
       
        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add(3);
        list.add(4);
        list.add("5");
        list.add("6");
        System.out.println(sumMixed(list));
    }
    
    
    public static int sumMixed(List<?> mixed) {
//        int sum = 0;
//        for (Object o : mixed) {
//            if (o instanceof String) {
//                sum += Integer.parseInt(o.toString());
//            } else sum += (int) o;
//        }
//       return sum;
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
