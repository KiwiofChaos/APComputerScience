public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(7));
        System.out.println(fibinnoci(23));
        System.out.println();
    }
    public static int factorial(int some_number) {
        if (some_number == 1) {
            return some_number;
        } else {
            return some_number * factorial(some_number - 1);
        }
    }
    public static int fibinnoci(int index) {
        if (index == 1 || index == 2) {
            return 1;
        } else {
            return fibinnoci(index - 1) + fibinnoci(index - 2);
        }
    }
    public static int[] pascalsTriangle(int row) {
        
    }
}