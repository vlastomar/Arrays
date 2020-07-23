import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int numberRotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberRotations ; i++) {
            for (int j = 0; j < arr.length - 1 ; j++) {
                int temp = arr[arr.length - 1 - j];
                arr[arr.length - 1 - j] = arr[0];
                arr[0] = temp;
            }

        }
        for (int num:arr ) {
            System.out.print(num + " ");
        }
    }
}
