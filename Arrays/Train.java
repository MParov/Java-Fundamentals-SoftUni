import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] passengers = new int[wagons];
        int passengersSum = 0;
        for (int i = 0; i <= passengers.length - 1; i++) {
            passengers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < passengers.length; i++) {
            passengersSum += passengers[i];
            System.out.print(passengers[i]);
            if (passengers.length != 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(passengersSum);
    }
}
