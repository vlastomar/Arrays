import javax.swing.*;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberRows = Integer.parseInt(scan.nextLine());
        System.out.println(1);
        String numberS = "1" + " " + "1";
        System.out.println(numberS);
        //String[] numberArray = numberS.split(" ");
        int[] numberArray = {1,1}; //new int[2];


        for (int i = 0; i < numberRows -2; i++) {
            //Spring[] rowArray = new Spring[numberArray.length + 1];
            int[] rowArray = new int[numberArray.length + 1];
            rowArray[0] = rowArray[rowArray.length - 1] = 1;
            for (int j = 1; j <rowArray.length - 1 ; j++) {
                rowArray[j] = numberArray[j-1] + numberArray[j];
            }
            for (int j = 0; j < rowArray.length - 1 ; j++) {

                System.out.print(rowArray[j] + " ");
            }
            System.out.println( rowArray[rowArray.length-1]);

            //System.out.println();
            numberArray = new int[rowArray.length];
            for (int j = 0; j <numberArray.length; j++) {
                numberArray[j] = rowArray[j];
            }

        }
    }
}
