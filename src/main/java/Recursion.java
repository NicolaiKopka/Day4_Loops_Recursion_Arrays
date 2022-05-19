public class Recursion {

    public static void main(String[] args) {

    }

    public static int sumRecursion(int[] numberArray, int start) {
        start++;
        if(start == (numberArray.length)) {
            return numberArray[start - 1];
        }
        return sumRecursion(numberArray, start) + numberArray[start - 1];
    }

    public static int faculty(int number) {
        if(number < 1) {
            return 1;
        }
        return faculty(number - 1) * number;
    }

    /*
    number = 3
    if(3<1){
    return 6;
    return 2 * 3
    number = 2
    if(2<1)
    return 1 * 2
    if(1<1)
    return 1 * 1
    if(0<1)
    return 1

     */

}
