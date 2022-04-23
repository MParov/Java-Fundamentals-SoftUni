import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 0) {
            printPositive(number);
        } else if (number < 0) {
            printNegative(number);
        } else {
            printZero(number);
        }
    }

    public static void printZero(int number) {
        System.out.printf("The number %d is zero.", number);
    }

    public static void printNegative(int number) {
        System.out.printf("The number %d is negative.", number);
    }

    private static void printPositive(int number) {
        System.out.printf("The number %d is positive.", number);
    }
}
