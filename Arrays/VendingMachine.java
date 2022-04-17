import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double coinsSum = 0.0;
        String command = scanner.nextLine();
        while (!command.equals("Start")) {
            double coin = Double.parseDouble(command);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1.0 || coin == 2.0) {
                coinsSum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (coinsSum >= 2.0) {
                        coinsSum -= 2.0;
                        System.out.println("Purchased " + product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (coinsSum >= 0.7) {
                        coinsSum -= 0.7;
                        System.out.println("Purchased " + product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (coinsSum >= 1.5) {
                        coinsSum -= 1.5;
                        System.out.println("Purchased " + product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (coinsSum >= 0.8) {
                        coinsSum -= 0.8;
                        System.out.println("Purchased " + product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (coinsSum >= 1.0) {
                        coinsSum -= 1.0;
                        System.out.println("Purchased " + product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", coinsSum);
    }
}
