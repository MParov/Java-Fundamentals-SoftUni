
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt) //.mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int maxRepeat = 0;
        int numRepeat = 0;
        for (int i = 0; i < arr.length; i++) {
            int repeat = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeat++;
                } else {
                    break;
                }
            }
            if (maxRepeat < repeat) {
                maxRepeat = repeat;
                numRepeat = arr[i];
            }
        }
        for (int i = 0; i < maxRepeat; i++) {
            System.out.print(numRepeat + " ");
        }
    }
}
