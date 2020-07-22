import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] dayWeeks = {"Invalid day!","Monday","Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday" };
        int numberDayWeek = Integer.parseInt(scan.nextLine());
        if (numberDayWeek >= 1 && numberDayWeek <=7) {
            System.out.println(dayWeeks[numberDayWeek]);
        }else{
            System.out.println(dayWeeks[0]);
        }
    }
}
