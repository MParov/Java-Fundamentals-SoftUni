import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split("\\s+");

        String[] secondArray = scanner.nextLine().split("\\s+");

        for (String secondElement : secondArray) {
            for (String firstElement : firstArray) {
                if (secondElement.equals(firstElement)) {
                    System.out.print(firstElement + " ");
                }
            }
        }
//        for (int i = 0; i < secondArray.length; i++) {
//            String secondElement = secondArray[i];
//            for (int j = 0; j < firstArray.length; j++) {
//                String firstElement = firstArray[j];
//                if (secondElement.equals(firstElement)) {
//                    System.out.print(secondElement + " ");
//                }
//            }
//        }
    }
}
