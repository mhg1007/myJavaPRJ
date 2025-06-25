package baekjoon;

import java.util.*;

public class B2592 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int N=s.nextInt();
            sum+=N;
            if(map.containsKey(N)){
                int ov=map.get(N);
                map.replace(N,ov,ov+1);
            }
            else{
                map.put(N,1);
            }
        }
        System.out.println(sum/10);
        for(int a:map.keySet()){
            if(Objects.equals(map.get(a), Collections.max(map.values()))){
                System.out.print(a);
                break;
            }
        }
    }
}
