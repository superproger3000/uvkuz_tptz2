import java.util.Scanner;
import java.io.InputStream;

public class NumberProcessor {
    public static int[] readNumbersFromFile(String fileName) {
        try {
            ClassLoader classLoader = Main.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream(fileName);
            Scanner scanner = new Scanner(inputStream);
            String line = scanner.nextLine();
            String[] numbersStr = line.split(" ");
            int[] numbers = new int[numbersStr.length];
            for (int i = 0; i < numbersStr.length; i++) {
                numbers[i] = Integer.parseInt(numbersStr[i]);
            }
            return numbers;
        } catch (Exception e) {
            e.printStackTrace();
            return new int[0];
        }
    }
    public static int min(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    public static int max(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static int mult(int[] numbers) {
        int mult = 1;
        for (int number : numbers) {
            mult *= number;
        }
        return mult;
    }
}
