import java.util.Arrays;
import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int[] numArray = new int[number];
        for (int i = 0; i < number ; i++) {
            int inputN = Integer.parseInt(scan.nextLine());
            numArray[i] = inputN;
        }
        for (int i = number - 1; i >= 0 ; i--) {
            System.out.print(numArray[i] + " ");
        }

        }

}
