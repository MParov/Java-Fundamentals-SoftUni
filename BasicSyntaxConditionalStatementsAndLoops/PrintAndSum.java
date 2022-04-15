package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
