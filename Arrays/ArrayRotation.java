import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");

        int displacement = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < displacement; i++) {
            String firstElement = line[0];
            for (int j = 0; j < line.length - 1; j++) {
                line[j] = line[j + 1];
            }
            line[line.length-1]= firstElement;
        }
        System.out.println(String.join(" ",line));
    }
}
