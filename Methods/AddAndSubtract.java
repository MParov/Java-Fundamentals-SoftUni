import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        print(third, sum(first, second));
    }

    public static Integer sum(int first, int second) {
        int sums = first + second;
        return sums;
    }

    public static void print(int third, int sums) {
        System.out.println(sums - third);
    }
}
