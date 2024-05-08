import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        String[] lines = {"строка 1", "строка 2", "строка 3"};

        System.out.println("Task 2");

        for (int number : numbers) {
            System.out.print(number + ",");
        }
        System.out.println();
        for (double fractionalNumber : fractionalNumbers) {
            System.out.print(fractionalNumber + ",");
        }
        System.out.println();
        for (String line : lines) {
            System.out.print(line + ",");
        }
        System.out.println();
        System.out.println("Task 3");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println();
        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            System.out.print(fractionalNumbers[i] + ",");
        }
        System.out.println();
        for (int i = lines.length - 1; i >= 0; i--) {
            System.out.print(lines[i] + ",");
        }
        System.out.println();
        System.out.println("Task 4");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("End");
    }
}