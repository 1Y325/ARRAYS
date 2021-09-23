public class varargs {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
//the value of a and b is given in source code
    public static void main(String[] args) {
        System.out.println("THE SUM OF THE NUMBER " + sum(7, 8));
        System.out.println("THE SUm OF THE NUMBER " + sum( 7, 8 , 9 ));
        System.out.println("the sum of the number " + sum(6, 8 ,9 ,6));
    }
}