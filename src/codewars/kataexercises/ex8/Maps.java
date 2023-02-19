package codewars.kataexercises.ex8;

import java.util.Arrays;

public class Maps {
    public static void main(String[] args) {
        int[] arrPow = map(new int[]{1, 2, 3, 4});
        System.out.println(
                Arrays.toString(arrPow)
        );
    }
    
    public static int[] map(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] *= arr[i];
//        }
//        return arr;
//    }
        int dub = 0;
        for (int i : arr) {
            arr[dub] = i * 2;
            dub++;
        }
        return arr;
    }
}
