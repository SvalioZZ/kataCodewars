package codewars.kataexercises.ex1;

/**
 * Complete the square sum function so that it squares each number passed into it and then sums the results together.
 *
 * For example, for [1, 2, 2] it should return 9
 *
 */

public class squareNsum {
    
    public static int squareNsum(int[] nums) {
//        int sqrSum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sqrSum += nums[i] * nums[i];
//        }
//        return sqrSum;
        
        
        int sum = 0;
        for (int num : nums) sum += Math.pow(num, 2);
        return sum;
        
    }
    
    public static void main(String[] args) {
        System.out.println(squareNsum(new int[]{1, 2, 2, 4, 7}));
    }
    
}
