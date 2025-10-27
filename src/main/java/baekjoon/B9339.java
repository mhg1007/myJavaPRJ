package baekjoon;

import java.util.*;

public class B9339 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int K=s.nextInt();
            List<Integer> list=new ArrayList<>();
            for (int j = 0; j < K; j++) {
                list.add(s.nextInt());
            }
            int N=s.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            int cnt=0;
            for (int j = 0; j < N; j++) {
                int pn=s.nextInt();
                int hr=s.nextInt();
                int mn=s.nextInt();
                if(list.contains(pn) && hr!=-1){
                    if(hr<6 || (hr==6 && mn==0)){
                        map.put(hr*60+mn,pn);
                        cnt++;
                    }
                }
            }
            System.out.println(map.get(Collections.min(map.keySet()))+" "+cnt);
        }
    }
}
