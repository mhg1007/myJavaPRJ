package baekjoon;
import java.util.Scanner;
public class B16625 {
    public  static boolean blink(int p,int q, int s){
        for(int i=1; i<=s; i++){
            if(i%p==0&&i%q==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int s=sc.nextInt();
        if(blink(p,q,s)){
            System.out.print("yes");
        }
        else {
            System.out.print("no");
        }
    }
}
