import java.util.*;

public class SymmetricalNum {
    private static boolean isSymmetric(int n){
        if (n < 0){
            return false;
        }
        int div = 1;

        while (n > div*10){
            div *= 10;
        }

        while(n > 0){
            if (n%10 != n/div){
                return false;
            }
            n = (n % div)/10;
            div /= 100;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isSymmetric(n)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}
