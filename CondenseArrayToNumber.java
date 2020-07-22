import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] arr2 = new int[numbers.length - 1];

        while (numbers.length > 1){
            for (int i = 0; i <numbers.length -1 ; i++) {
                arr2[i] = numbers[i] + numbers[i+1];
            }
            numbers = new int[arr2.length];
            numbers = arr2;
            if (numbers.length > 1) {
                arr2 = new int[numbers.length - 1];
            }
        }
        System.out.println(numbers[0]);
    }
}
