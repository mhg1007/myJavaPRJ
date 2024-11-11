package baekjoon;
import java.util.Scanner;
public class B10801 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] arra=new int[10];
        int[] arrb=new int[10];
        for (int i = 0; i < 10; i++) {
            arra[i]=s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            arrb[i]=s.nextInt();
        }
        int cnta=0,cntb=0;
        for (int i = 0; i < 10; i++) {
            if(arra[i]>arrb[i]){
                cnta++;
            }
            else if(arra[i]<arrb[i]){
                cntb++;
            }
        }
        if(cnta>cntb){
            System.out.print("A");
        }
        else if(cnta<cntb){
            System.out.print("B");
        }
        else{
            System.out.print("D");
        }
    }
}
