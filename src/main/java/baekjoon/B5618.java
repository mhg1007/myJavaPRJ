package baekjoon;

import java.util.Scanner;

public class B5618 {
    public static int ecd(int a, int b){
        return b==0? a : ecd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        StringBuilder sb=new StringBuilder();
        int gcd=0;
        if(n==2){
            gcd=ecd(s.nextInt(), s.nextInt());
        }
        else if(n==3){
            int[] arr={s.nextInt(),s.nextInt(),s.nextInt()};
            gcd=ecd(arr[0],arr[1]);
            gcd=ecd(gcd,arr[2]);
        }
        for (int i = 1; i <= gcd; i++) {
            if(gcd%i==0){
                sb.append(i).append("\n");
            }
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
