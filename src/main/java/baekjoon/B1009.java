package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            List<Integer> list=new ArrayList<>();
            if(a<10){
                list.add(a);
            }
            else{
                int chg=a;
                while(chg>10){
                    chg%=10;
                }
                list.add(chg);
            }
            while(true){
                int lst=list.get(list.size()-1);
                int nxt=lst*a;
                while(nxt>10){
                    nxt%=10;
                }
                if(list.contains(nxt)){
                    break;
                }
                else {
                    list.add(nxt);
                }
            }
            int pos=b%list.size()-1;
            if(pos<0){
                pos+=list.size();
            }
            System.out.println(list.get(pos)==0?10:list.get(pos));
        }
    }
}
