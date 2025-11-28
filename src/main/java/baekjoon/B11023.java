package baekjoon;

import java.util.Scanner;

public class B11023 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        while(s.hasNextInt()){
            sum+=s.nextInt();
        }
        System.out.print(sum);
    }
}
