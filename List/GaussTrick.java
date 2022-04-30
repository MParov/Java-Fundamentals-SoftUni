import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> sumNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size() / 2; i++) {

            sumNumbers.add(numbers.get(i) + numbers.get(numbers.size() - 1 - i));
        }
        if (numbers.size() % 2 != 0) {
            sumNumbers.add(numbers.get(numbers.size() / 2));
        }
        for (Integer sumNumber : sumNumbers) {
            System.out.print(sumNumber + " ");
        }

    }
}
