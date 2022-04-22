import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        ;

        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(first);
                int secondNumber = Integer.parseInt(second);
                System.out.println(getMax(firstNumber, secondNumber));
                break;
            case "char":
                System.out.println(getMax(first.charAt(0), second.charAt(0)));
                break;
            case "string":
                System.out.println(getMax(first, second));
                break;
        }
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    public static int getMax(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }
}
