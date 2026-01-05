package baekjoon;

import java.util.Scanner;

public class B14582 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] uj=new int[9];
        int[] sg=new int[9];
        for (int i = 0; i < 9; i++) {
            uj[i]=s.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            sg[i]=s.nextInt();
        }
        int su=0,ss=0;
        boolean chk=false;
        for (int i = 0; i < 9; i++) {
            su+=uj[i];
            if(su>ss){
                chk=true;
            }
            ss+=sg[i];
        }
        System.out.print(chk?"Yes":"No");
    }
}
