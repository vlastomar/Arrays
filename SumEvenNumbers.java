import java.util.Scanner;
import java.util.Arrays;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;

        for (int num:numbers
             ) {
            if (num % 2 == 0){
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
