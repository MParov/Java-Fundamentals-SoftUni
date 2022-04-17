import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] line = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
boolean isEqual=false;
        for (int i = 0; i < line.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = i - 1; j >= 0; j--) {
                leftSum += line[j];
            }
            for (int j = i + 1; j < line.length; j++) {
                rightSum += line[j];
            }
            if(rightSum==leftSum){
                isEqual=true;
                System.out.println(i);
            }
        }
        if(!isEqual){
            System.out.println("no");
        }
    }
}
