import java.util.*;
import java.util.stream.Collectors;

public class GreedyAlgorithmCoins {
    public static void main(String[] args) {


        int[] coins = {1,10,50,25,4,5};
        int targetSum = 18;

        List<Integer> sortedCoins = Arrays.stream(coins).boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        Map<Integer, Integer> chosenCoins = new LinkedHashMap<>();
        int currentSum = 0; int coinIndex = 0;
        while (currentSum != targetSum && coinIndex < sortedCoins.size()) {
            int currentCoin = sortedCoins.get(coinIndex);
            int remainder = targetSum - currentSum;
            int numberOfCoins = remainder / currentCoin;
            if (currentSum + currentCoin <= targetSum) {
                chosenCoins.put(currentCoin, numberOfCoins);
                currentSum += numberOfCoins * currentCoin;
            }
            coinIndex++;
        }

        if (currentSum != targetSum)
            throw new IllegalArgumentException();
        System.out.println(chosenCoins);

    }
}
