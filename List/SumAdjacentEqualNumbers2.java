import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> nextNumbers = sumAdjacentEqualNumbers(numbers);
        while (nextNumbers.size() != numbers.size()) {
            numbers = nextNumbers;
            nextNumbers = sumAdjacentEqualNumbers(numbers);
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> sumAdjacentEqualNumbers(List<Integer> numbers) {
        List<Integer> nextNumber = new ArrayList<>();

        int i = 0;
        while (i < numbers.size()) {

            if (i < numbers.size() - 1 && numbers.get(1) == numbers.get(i + 1)) {
                nextNumber.add(numbers.get(i) + numbers.get(i + 1));
                i += 2;
            } else {
                nextNumber.add(numbers.get(i));
                i++;
            }
        }
        return nextNumber;
    }
}
