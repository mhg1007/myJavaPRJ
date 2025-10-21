package baekjoon;

import java.util.Scanner;

public class B9229 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true) {
            boolean chk=true;
            String bf=s.next();
            if(bf.equals("#")) break;
            while(true) {
                String wd=s.next();
                if(wd.equals("#")) break;
                if(wd.length()!=bf.length()){
                    chk=false;
                }
                else{
                    int cnt=0;
                    for (int i = 0; i < wd.length(); i++) {
                        if(wd.charAt(i)!=bf.charAt(i)){
                            cnt++;
                        }
                    }
                    if(cnt!=1){
                        chk=false;
                    }
                }
                bf=wd;
            }
            System.out.println(chk?"Correct":"Incorrect");
        }
    }
}
