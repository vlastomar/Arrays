import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstArr = scan.nextLine().split(" ");
        String[] secondArr = scan.nextLine().split(" ");

        String result = "";

        for (int i = 0; i <secondArr.length ; i++) {
            for (int j = 0; j < firstArr.length ; j++) {
                if (secondArr[i].equals(firstArr[j])){
                    //result += secondArr[i];
                    System.out.print(secondArr[i] + " ");
                    break;
                }
            }

        }
        //System.out.println(result);
    }
}
