package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B16032 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int n=s.nextInt();
            if(n==0) break;
            int sum=0;
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a=s.nextInt();
                list.add(a);
                sum+=a;
            }
            double avg=(double)sum/n;
            int cnt=0;
            for(int a:list){
                if(a<=avg){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
