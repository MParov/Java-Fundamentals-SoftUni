import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        List<Double> nextNumbers = sumAdjacentEqualNumbers(numbers);
        while (nextNumbers.size() != numbers.size()) {
            numbers = nextNumbers;
            nextNumbers = sumAdjacentEqualNumbers(numbers);
        }

        for (Double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number)+" ");
        }
    }

    private static List<Double> sumAdjacentEqualNumbers(List<Double> numbers) {
        List<Double> nextNumber = new ArrayList<>();

        int i = 0;
        while (i < numbers.size()) {

            if (i < numbers.size() - 1 && numbers.get(i).equals(numbers.get(i + 1))) {
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
