import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 2.00 && grade <= 2.99) {
            fail();
        } else if (grade >= 3.00 && grade <= 3.49) {
            poor();
        } else if (grade >= 3.50 && grade <= 4.49) {
            good();
        } else if (grade >= 4.50 && grade <= 5.49) {
            veryGood();
        } else if (grade >= 5.50 && grade <= 6.00) {
            excellent();
        }
    }

    public static void excellent() {
        System.out.println("Excellent");
    }

    public static void veryGood() {
        System.out.println("Very good");
    }

    public static void good() {
        System.out.println("Good");
    }

    public static void poor() {
        System.out.println("Poor");
    }

    public static void fail() {
        System.out.println("Fail");
    }
}
