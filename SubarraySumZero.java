import java.util.*;

public class SubarraySumZero {

    public static void main(String[] args){

        int[] arr = {4, -6, 3, -1, 4, 2, 7};
        //List<Integer> arr2 = List.of(4,5,66);
        //System.out.println(arr2);

        if(hasZeroSum(arr)){
            System.out.println("exists");
        }else{
            System.out.println("NO");
        }

    }

    public static Boolean hasZeroSum(int[] arr){
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for(int numb : arr){
            sum += numb;
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}
