import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean check = true;

        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length  ; j++) {
                if (array[i] <= array[j]){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(array[i] + " ");
            }
            check = true;
        }
    }
}
