package baekjoon;
import java.util.Scanner;
public class B2864 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        String AA=String.valueOf(A);
        String BB=String.valueOf(B);

        int AMIN=0,AMAX=0,BMIN=0,BMAX=0;
        if(AA.contains("5")||AA.contains("6")){
            AA=AA.replace('6','5');
            AMIN=Integer.parseInt(AA);
            AA=AA.replace('5','6');
            AMAX=Integer.parseInt(AA);
        }
        else{
            AMIN=A;
            AMAX=A;
        }

        if(BB.contains("5")||BB.contains("6")){
            BB=BB.replace('6','5');
            BMIN=Integer.parseInt(BB);
            BB=BB.replace('5','6');
            BMAX=Integer.parseInt(BB);
        }
        else{
            BMIN=B;
            BMAX=B;
        }

        System.out.println((AMIN+BMIN)+" "+(AMAX+BMAX));
    }
}
