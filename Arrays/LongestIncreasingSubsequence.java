import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;
        do {
            System.out.print("Please insert length of the Array: ");
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        int[] array = new int[arrayLength];//{3, 14, 5, 12, 15, 7, 8, 9, 11, 10, 1};

        for (int i = 0; i < array.length; i++) {
            System.out.print("Please insert number " + (i + 1) + " of array: ");
            array[i] = scanner.nextInt();
        }

        int[] lisLengths = new int[array.length];

        int[] lisPrev = new int[array.length];

        for (int i = 0; i < lisLengths.length; i++) {
            lisLengths[i] = 1;
            lisPrev[i] = -1;
        }
        for (int currentIndex = 1; currentIndex < lisLengths.length; currentIndex++) {
            for (int prevIndex = 0; prevIndex < currentIndex; prevIndex++) {
                if (array[prevIndex] < array[currentIndex]) {
                    int candidateLength = lisLengths[prevIndex] + 1;
                    if (candidateLength > lisLengths[currentIndex]) {
                        lisLengths[currentIndex] = candidateLength;
                        lisPrev[currentIndex] = prevIndex;
                    }
                }
            }
        }
        int maxLength = 0;
        int maxLengthIndex = -1;
        for (int i = 0; i < lisLengths.length; i++) {
            if (lisLengths[i] > maxLength) {
                maxLength = lisLengths[i];
                maxLengthIndex = i;
            }
        }
        int[] lis = new int[maxLength];
        int position = 0;
        int index = maxLengthIndex;
        while (index != -1) {
            lis[position] = array[index];
            position++;
            index = lisPrev[index];
        }

        for (int i = lis.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(lis[i] + ", ");
            } else {
                System.out.print(lis[i]);
            }
        }
    }
}
