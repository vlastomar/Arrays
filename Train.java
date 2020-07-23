import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wagons = Integer.parseInt(scan.nextLine());
        int[] train = new int[wagons];

        int sum = 0;

        for (int i = 0; i < wagons ; i++) {
            int peopleEachWagon = Integer.parseInt(scan.nextLine());
            train[i] = peopleEachWagon;
        }
        for (int num:train) {
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println();
        System.out.print(sum);
    }
}
