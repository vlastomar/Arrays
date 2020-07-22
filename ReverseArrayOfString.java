import java.util.Scanner;

public class ReverseArrayOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] arr = scan.nextLine().split(" ");

        for (int i = 0; i < arr.length/2 ; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (String nume:arr
             ) {
            System.out.print(nume + " ");
        }
    }
}
