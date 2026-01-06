package baekjoon;

import java.util.Scanner;

public class B15722 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int seq=0;
        int sec=0;
        int mv=1;
        int n=s.nextInt();
        int[] arr={0,0};
        if(n!=0) {
            snail:
            while (true) {
                seq++;
                switch ((seq - 1) % 4) {
                    case 0:
                        for (int i = 0; i < mv; i++) {
                            arr[1] += 1;
                            sec++;
                            if (sec == n) break snail;
                        }
                        break;
                    case 1:
                        for (int i = 0; i < mv; i++) {
                            arr[0] += 1;
                            sec++;
                            if (sec == n) break snail;
                        }
                        break;
                    case 2:
                        for (int i = 0; i < mv; i++) {
                            arr[1] -= 1;
                            sec++;
                            if (sec == n) break snail;
                        }
                        break;
                    case 3:
                        for (int i = 0; i < mv; i++) {
                            arr[0] -= 1;
                            sec++;
                            if (sec == n) break snail;
                        }
                        break;
                }
                if (seq % 2 == 0) {
                    mv++;
                }
            }
        }
        System.out.print(arr[0]+" "+arr[1]);
    }
}
