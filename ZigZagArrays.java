import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int[] firstArray = new int[number];
        int[] secondArray = new int[number];

        for (int i = 0; i < number ; i++) {
            //int firstN = Integer.parseInt(scan.nextLine());
            //int secondN = Integer.parseInt(scan.nextLine());
            int[] thirdArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

            if (i % 2 == 0){
                secondArray[i] = thirdArray[0];
                firstArray[i] = thirdArray[1];
            }else {
                firstArray[i] = thirdArray[0];
                secondArray[i] = thirdArray[1];
            }
        }
        for (int num:secondArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num:firstArray) {
            System.out.print(num + " ");
        }

    }
}
