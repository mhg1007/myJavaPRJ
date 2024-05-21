package baekjoon;
import java.util.Scanner;
public class B3003 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] set=new int[6];
        int king=s.nextInt();
        set[0]=1-king;

        int queen=s.nextInt();
        set[1]=1-queen;

        int rook=s.nextInt();
        set[2]=2-rook;

        int bishop=s.nextInt();
        set[3]=2-bishop;

        int knight=s.nextInt();
        set[4]=2-knight;

        int pawn=s.nextInt();
        set[5]=8-pawn;

        for (int i:set){
            System.out.print(i+" ");
        }
    }
}
