package Code02_05;

import java.util.Scanner;
public class Code05_02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("숫자입력:");
        int num=s.nextInt();

        if (num<100){
            System.out.print("100보다 ");
            System.out.print("작습니다.");
        }

        s.close();
    }
}
