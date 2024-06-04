package baekjoon;
import java.util.Scanner;
public class B10798 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[][] strarr=new String[5][15];
        for (int i = 0; i < 5; i++) {
            String str=s.nextLine();
            int len=str.length();
            for (int j = 0; j < len; j++) {
                strarr[i][j]= String.valueOf(str.charAt(j));
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(strarr[j][i]!=null){
                    System.out.print(strarr[j][i]);
                }
            }
        }
    }
}
