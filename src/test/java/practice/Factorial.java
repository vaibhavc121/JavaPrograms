package practice;

public class Factorial {
    static int factorial(int n) {
        if (n == 0) {  // Base case
            return 1;
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
    //test
}