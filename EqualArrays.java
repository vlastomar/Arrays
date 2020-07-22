import java.util.Scanner;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

       /* if (firstArr.length == secondArr.length){

        }else {

        }*/
        boolean check = true;
        int sum = 0;
        for (int i = 0; i <firstArr.length ; i++) {
            if (firstArr[i] != secondArr[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                check = false;
                break;
            }else {
                sum += firstArr[i];
            }
        }
        if (check){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
