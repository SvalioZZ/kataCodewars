package codewars.kataexercises.ex4;

/**
 * You have to write a function that accepts three parameters:
 *
 * cap - is the amount of people the bus can hold excluding the driver.
 * on - is the number of people on the bus excluding the driver.
 * wait - is the number of people waiting to get on to the bus excluding the driver.
 * If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.
 */

public class enoughSpace {
    
    public static int enough(int cap, int on, int wait){
        while(on < cap && wait > 0){
            if (wait > cap - on){
                return on + wait - cap;
            } else {
                return 0;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
    
        System.out.println(enough(10, 5, 10));
    
    }

}
