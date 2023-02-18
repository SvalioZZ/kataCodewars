package codewars.kataexercises.ex5;


public class SumArray {
    public static void main(String[] args) {
        System.out.println(sum(new double[]{1, 5.2, 4, 0, -1}));
//        System.out.println(sum(new double[]{}));
    }
    
    public static double sum(double[] numbers) {
        double sum = 0;
        if (!(numbers.length == 0)) {
            for (double number : numbers) {
                sum += number;
            }
        } else {
            return 0.0;
        }
        return sum;
    }
}

