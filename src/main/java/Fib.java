import java.util.HashMap;
import java.util.Map;

public class Fib {

    public static void main(String[] args) {
        System.out.println(fibHash(6));
    }

    public static int fib(int n) {
        if(n < 2) {
            return n;
        }
        return fib(n - 2 ) + fib(n - 1);
    }

    /*
    fib3

    1                   +                        1
    return 1                                            fib(0)      +      fib(1)
                                                        return 0            return 1
     */

    public static int fibIterative(int n) {
        int lastNum = 0;
        int nextNum = 1;
        for (int i = 0; i < n; i++) {
            int oldLastNum = lastNum;
            lastNum = nextNum;
            nextNum = oldLastNum + nextNum;
        }
        return lastNum;
    }


    /*  Durchgang 3:

        oldLastNum = 2
        lastNum = 3
        nextNum = 5

        return lastNum = 3
     */

    public static int fibHash(int n) {
        Map<Integer, Integer> allKnownNumbers = new HashMap<>(Map.of(0,0,1,1));
        if(allKnownNumbers.get(n) != null) {
            return allKnownNumbers.get(n);
        } else {
            allKnownNumbers.put(n, fibHash(n-2) + fibHash(n-1));
        }
        return allKnownNumbers.get(n);
    }


}
