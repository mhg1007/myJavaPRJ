package baekjoon;
import java.util.Scanner;
public class B9506 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true) {
            int n = s.nextInt();
            if(n==-1) {
                break;
            }
            int[] arr = new int[n];
            int set = 0;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    arr[set] = i;
                    set++;
                }
            }
            for (int i = 0; i < set; i++) {
                sum += arr[i];
            }
            if ((sum - n) == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < set - 1; i++) {
                    System.out.print(arr[i]);
                    if (i != set - 2) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
