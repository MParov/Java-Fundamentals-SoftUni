import java.util.*;

public class AppendArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inputRow = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\|+")));

        Collections.reverse(inputRow);
        System.out.println(inputRow.toString().replaceAll("\\[+", "")
                .replaceAll("]", "")
                .replaceAll("\\|+", "")
                .replaceAll(",", "").trim()
                .replaceAll("\\s+"," "));
    }
}
