public class Fib {

    public static void main(String[] args) {

    }

    public static int fib(int n) {
        if(n < 2) {
            return n;
        }
        return fib(n - 2 ) + fib(n - 1);
    }

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


}
