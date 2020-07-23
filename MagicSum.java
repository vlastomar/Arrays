import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arrayNumbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int numberForCompare = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < arrayNumbers.length ; i++) {
            for (int j = i + 1; j < arrayNumbers.length ; j++) {
                int temp = arrayNumbers[i] + arrayNumbers[j];
                if (temp == numberForCompare){
                    System.out.println(arrayNumbers[i] + " " + arrayNumbers[j]);
                }
            }
        }
    }
}
