import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(a -> Integer.parseInt(a))
                .toArray();
        int[] secondArray = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(a -> Integer.parseInt(a))
                .toArray();
        boolean isIdentical = true;
        int arrSum = 0;
        for (int i = 0; i <= firstArray.length - 1; i++) {
            if (firstArray[i] == secondArray[i]) {
                arrSum += firstArray[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isIdentical = false;
                break;
            }
        }
        if (isIdentical) {
            System.out.println("Arrays are identical. Sum: " + arrSum);
        }
    }
}
