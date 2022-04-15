import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split("\\s+");

        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.print(elements[i]);
            if (elements.length != 0){
                System.out.print(" ");
            }
        }
    }
}
