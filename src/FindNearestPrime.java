import java.util.*;

public class FindNearestPrime {
    private static boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n;
        int n2 = n;
        int ans = 0;

        while(true){
            if (isPrime(n1)){
                ans = n1;
                break;
            }
            else{
                n1 --;
            }

            if (isPrime(n2)){
                ans = n2;
                break;
            }
            else{
                n2 ++;
            }

        }

        System.out.println(ans);

        sc.close();
    }
}
