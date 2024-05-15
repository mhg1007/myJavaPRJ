package baekjoon;
import java.util.Scanner;
public class B1152 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.nextLine();
        String SS=S.trim();
        int L=SS.length();
        int blk=0;
        for (int i=0;i<L;i++){
            if(SS.charAt(i) == ' '){
                blk++;
            }
        }
        if (SS.replaceAll(" ", "").isEmpty())
            System.out.print(0);
        else
            System.out.print(blk+1);

        s.close();
    }
}
