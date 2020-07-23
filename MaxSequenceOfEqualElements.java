import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] number = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int counter = 1;
        String numb = "";
        int countCheck = 0;
        String finalNumber = "";

        for (int i = 0; i < number.length ; i++) {
            numb = number[i] + " ";
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] != number[j]){
                    break;
                }
                counter++;
                numb += number[i] + " " ;
            }
            if (counter > countCheck){
                countCheck = counter;
                finalNumber = numb;
            }
            counter = 1;

        }
        System.out.print(finalNumber);
    }
}
