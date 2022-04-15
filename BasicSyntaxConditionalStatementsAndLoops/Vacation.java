package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;

        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        if (persons >= 30) {
                            double price = persons * 8.45;
                            totalPrice = price * 0.85;
                        } else {
                            totalPrice = persons * 8.45;
                        }
                        break;
                    case "Saturday":
                        if (persons >= 30) {
                            double price = persons * 9.80;
                            totalPrice = price * 0.85;
                        } else {
                            totalPrice = persons * 9.80;
                        }
                        break;
                    case "Sunday":
                        if (persons >= 30) {
                            double price = persons * 10.46;
                            totalPrice = price * 0.85;
                        } else {
                            totalPrice = persons * 10.46;
                        }
                        break;
                }
                break;

            case "Business":
                switch (day) {
                    case "Friday":
                        if (persons >= 100) {
                            totalPrice = persons - 10 * 10.90;
                        } else {
                            totalPrice = persons * 10.90;
                        }
                        break;
                    case "Saturday":
                        if (persons >= 100) {
                            totalPrice = persons - 10 * 15.60;
                        } else {
                            totalPrice = persons * 15.60;
                        }
                        break;
                    case "Sunday":
                        if (persons >= 100) {
                            totalPrice = persons - 10 * 16;
                        } else {
                            totalPrice = persons * 16;
                        }
                        break;
                }

            case "Regular":
                switch (day) {
                    case "Friday":
                        if (persons >= 10 && persons <= 20) {
                            double price = persons * 15;
                            totalPrice = price * 0.95;
                        } else {
                            totalPrice = persons * 15;
                        }
                        break;
                    case "Saturday":
                        if (persons >= 10 && persons <= 20) {
                            double price = persons * 20;
                            totalPrice = price * 0.95;
                        } else {
                            totalPrice = persons * 20;
                        }
                        break;
                    case "Sunday":
                        if (persons >= 10 && persons <= 20) {
                            double price = persons * 22.5;
                            totalPrice = price * 0.95;
                        } else {
                            totalPrice = persons * 22.5;
                        }
                        break;
                }
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
