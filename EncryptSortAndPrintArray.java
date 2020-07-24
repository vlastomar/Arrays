import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sequencesString = Integer.parseInt(scan.nextLine());
        int [] calculatedSum = new int[sequencesString];



        for (int i = 0; i < sequencesString ; i++) {
            char[] name = scan.nextLine().toCharArray();
            int sum = 0;
            for (int j = 0; j < name.length ; j++) {
                char temp = name[j];
                if (temp == 'A' || temp == 'a' || temp == 'E' || temp == 'e'  ||
                        temp == 'U'|| temp == 'u' || temp == 'I' || temp == 'i' ||
                        temp == 'O' || temp == 'o' ){
                    sum = sum + temp * name.length;
            } else{
                    sum = sum + temp/name.length;
                }
            }
            calculatedSum[i] = sum;
        }
            int[] finalArray = new int[sequencesString];
        for (int i = 0; i < sequencesString ; i++) {
            finalArray[i] = Integer.MAX_VALUE;
            int counter = 0;
            for (int j = 0; j < calculatedSum.length; j++) {
                if (calculatedSum[j] < finalArray[i]){
                    finalArray[i] = calculatedSum[j];
                    counter = j;
                }
            }
            calculatedSum[counter] = Integer.MAX_VALUE;

        }
        for (int num:finalArray
             ) {
            System.out.println(num);
        }
    }
}
