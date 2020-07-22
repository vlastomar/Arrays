import  java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumOdd = 0;
        int sumEven = 0;

        for (int num:numbers) {
            if (num % 2 == 0){
                sumEven += num;
            }else {
                sumOdd += num;
            }

        }
        sumEven = sumEven - sumOdd;
        //sumEven = Math.abs(sumEven);
        System.out.println(sumEven);



    }


}

