package ws11functionsandrecursion;

public class WS11FunctionsandRecursion {

    public static void main(String[] args) {
        int number = 5;
        int fact = 0;
        fact = factorial(number);
        System.out.println("factorial of " + number + " is equal to -> " + fact);

    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));

            }
        }
    }
}
