import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAllSubZero {
    public static void main(String[] args){
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        printAllSubZero(arr);
    }

    private static void printAllSubZero(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        insert(map,0,-1);
        int sum = 0;

        for(int i = 0;i < arr.length; i++){
            sum += arr[i];
            if (map.containsKey(sum)){
                //List<Integer> list = map.get(sum);
                for(Integer value : map.get(sum)){
                    System.out.println("Subarray [" + (value + 1) + "..." + i + "]");
                }
            }
            insert(map,sum,i);
        }
    }

    private static<K,V> void insert(Map<K, List<V>> map, K key, V value) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(value);
    }
}
