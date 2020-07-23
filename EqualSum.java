import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean check = true;

        for (int i = 0; i < array.length ; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = i + 1; j < array.length ; j++) {

                sumRight += array[j];
            }
            for (int j = i - 1; j >= 0 ; j--) {
                sumLeft += array[j];
            }

            if (i == array.length -1){
                sumRight = 0;
            }else if (i == 0){
                sumLeft = 0;
            }
            if (sumLeft == sumRight){
                System.out.println(i);
                check = false;

            }
        }
        if (check){
            System.out.println("no");
        }
    }
}
