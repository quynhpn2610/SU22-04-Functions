// This program prints the largest digit of a positive integer

import java.util.*;

public class LargestDigit {
    private static int largestDigit(int n){
        int max = 0;
        while (n > 0){
            int x = n % 10;
            if (x > max){
                max = x;
            }
            n /= 10;
        }
        return max;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(largestDigit(n));
    }
}
