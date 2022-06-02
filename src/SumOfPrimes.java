import java.util.*;

public class SumOfPrimes{
    private static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++){
            if (isPrime(i)){
                sum += i;
            }
        }

        System.out.print(sum);
    }
}