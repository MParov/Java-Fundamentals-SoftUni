import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] line = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < line.length; i++) {
            boolean isBigger = true;
            int currentElement = line[i];
            for (int j = i + 1; j < line.length; j++) {
                if (currentElement <= line[j]) {
                    isBigger = false;
                    continue;
                }
            }
            if (isBigger) {
                System.out.print(currentElement + " ");
            }
        }
    }
}
