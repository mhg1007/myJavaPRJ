package baekjoon;
import java.util.Scanner;
public class B5622 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.nextLine();
        int len=S.length();
        int dial=0;

        for (int i = 0; i < len; i++) {
            int ASC= S.charAt(i);
            if(ASC>=65&&ASC<=67)
                dial+=3;
            else if(ASC>=68&&ASC<=70)
                dial+=4;
            else if(ASC>=71&&ASC<=73)
                dial+=5;
            else if(ASC>=74&&ASC<=76)
                dial+=6;
            else if(ASC>=77&&ASC<=79)
                dial+=7;
            else if(ASC>=80&&ASC<=83)
                dial+=8;
            else if(ASC>=84&&ASC<=86)
                dial+=9;
            else if(ASC>=87&&ASC<=90)
                dial+=10;
        }
        System.out.print(dial);
    }
}
