package baekjoon;
import java.util.Scanner;
public class B2908 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.next();
        String B=s.next();
        int[] AA=new int[3];
        int[] BB=new int[3];
        for(int i=0; i<3; i++){
            AA[i]=Integer.parseInt(String.valueOf(A.charAt(i)));
            BB[i]=Integer.parseInt(String.valueOf(B.charAt(i)));
        }
        int AAA=AA[2]*100+AA[1]*10+AA[0];
        int BBB=BB[2]*100+BB[1]*10+BB[0];
        if (AAA>BBB)
            System.out.print(AAA);
        else if(BBB>AAA)
            System.out.print(BBB);

        s.close();
    }
}
