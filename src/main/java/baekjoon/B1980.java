package baekjoon;

import java.util.*;

public class B1980 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int t=s.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <= t/n; i++) {
            for (int j = 0; j <= t/m; j++) {
                int sum=i+j;
                int ck=t-i*n-j*m;
                if(i*n+j*m<=t){
                    if(map.containsKey(sum)){
                        int ov=map.get(sum);
                        if(ov>ck){
                            map.replace(sum,ov,ck);
                        }
                    }
                    else{
                        map.put(sum,ck);
                    }
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        int min= Collections.min(map.values());
        for (int a:map.keySet()){
            if(map.get(a)==min){
                list.add(a);
            }
        }
        Collections.sort(list);
        System.out.print(list.get(list.size()-1)+" "+min);
    }
}
