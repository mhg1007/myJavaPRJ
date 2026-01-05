package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B14606 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int N=s.nextInt();
        list.add(N);
        int scr=0;
        while(true){
            List<Integer> list2=new ArrayList<>();
            for(int a:list){
                if(a==1){
                    list2.add(a);
                }
                else{
                    int a1=a/2;
                    int a2=a-a1;
                    scr+=a1*a2;
                    list2.add(a1);
                    list2.add(a2);
                }
            }
            boolean flg=true;
            for(int a:list2){
                if(a!=1){
                    flg=false;
                    break;
                }
            }
            if(flg){
                break;
            }
            list=list2;
        }
        System.out.print(scr);
    }
}
