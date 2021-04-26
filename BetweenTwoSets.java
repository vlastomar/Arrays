import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {

        //int[] a = {2,6};

        //int[] b = {24,36};
        List<Integer> aa = List.of(2,6);
        List<Integer> bb = List.of(24,36);

        int[] a = new int[aa.size()];
        for (int i = 0; i < aa.size() ; i++) {
            a[i] = aa.get(i);
        }

        int[] b = new int[bb.size()];
        for (int i = 0; i < bb.size() ; i++) {
            b[i] = bb.get(i);
        }





        int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;}
        }
        System.out.println(count);
    }


    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static int gcd(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }
}
