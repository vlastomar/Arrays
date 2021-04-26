import java.util.HashMap;
import java.util.Map;

public class PairSUmArray {

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;

        findPair(arr,sum);



    }

    public static void findPair(int[] arr, int sum){

        Map<Integer,Integer> map = new HashMap<>();
        boolean check = true;

       for(int i = 0; i < arr.length ; i++){
           if(map.containsKey(sum - arr[i])){
               System.out.println("Pair found in index:" + map.get(sum - arr[i]) + " and " + i);
               check = false;
           }
           map.put(arr[i],i);

       }
       if(check){
           System.out.println("Pair not found");
       }
    }


}
