import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> scores = List.of(3, 4 ,21, 36 ,10, 28 ,35, 5, 24, 42);

        int minN = scores.get(0);
        int maxN = scores.get(0);
        int minResult = 0;
        int maxResult = 0;

        for (Integer s : scores) {
            if (s > maxN){
                maxResult++;
                maxN = s;
            }else if (s < minN){
                minResult++;
                minN = s;
            }
        }
        System.out.println(maxResult);
        System.out.println(minResult);

    }
}
