import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int end = Integer.parseInt(scanner.nextLine());
        int start = 1;

        for (int i = 0; i < end; i++) {
            printLine(1, i);
        }
        printLine(1,end);
        for (int i = end - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
