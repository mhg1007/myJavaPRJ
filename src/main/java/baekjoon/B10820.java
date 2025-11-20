package baekjoon;

import java.util.Scanner;

public class B10820 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()){
            String str=s.nextLine();
            if(str.isEmpty())break;
            int lc=0;
            int uc=0;
            int nm=0;
            int blk=0;
            for (int i = 0; i < str.length(); i++) {
                char c=str.charAt(i);
                if(c>=97 && c<=122){
                    lc++;
                }
                else if(c>=65 && c<=90){
                    uc++;
                }
                else if(c>=48 && c<=57){
                    nm++;
                }
                else{
                    blk++;
                }
            }
            System.out.println(lc+" "+uc+" "+nm+" "+blk);
        }
    }
}
