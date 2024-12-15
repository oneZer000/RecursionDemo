public class Main {

    public static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number % 10 + sumDigits(number / 10);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Сумма цифр числа " + number + ": " + sumDigits(number));

        int n = 5;
        System.out.println("Факториал числа " + n + ": " + factorial(n));

        int a = 2, b = 3;
        System.out.println(a + " в степени " + b + ": " + power(a, b));

        int fibIndex = 6;
        System.out.println(fibIndex + "-е число Фибоначчи: " + fibonacci(fibIndex));
    }

}