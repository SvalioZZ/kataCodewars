package codewars.kataexercises.ex2;

/**
 * url: <a href="https://www.codewars.com/kata/568d0dd208ee69389d000016/train/java">...</a>
 *
 * @author SvalioZZ -> [<a href="https://github.com/SvalioZZ">...</a>]
 * After a hard quarter in the office you decide to get some rest on a vacation.
 * So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
 * You will need a rental car in order for you to get around in your vacation.
 * The manager of the car rental makes you some good offers.
 * Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
 * Write a code that gives out the total amount for different days(d).
 */

public class rentACar {
    
    public static void main(String[] args) {
        System.out.println("your rental car costs: " + rentACar(4));
    }
    
    public static int rentACar(int daysRented) {
        int total = 0;
            if (daysRented < 3) {
                total += daysRented * 40;
            } else if (daysRented < 7) {
                total += (daysRented * 40 - 20);
            } else {
                total += (daysRented * 40 - 50);
            }
        return total;
    }
}
