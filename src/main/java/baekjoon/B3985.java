package baekjoon;

import java.util.*;

public class B3985 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int L=s.nextInt();
        boolean[] arr=new boolean[L];
        Arrays.fill(arr,true);
        int N=s.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for (int i = 0; i < N; i++) {
            int st=s.nextInt();
            int ed=s.nextInt();
            int cnt=0;
            for (int j = st-1; j <= ed-1; j++) {
                if(arr[j]){
                    arr[j]=false;
                    cnt++;
                }
            }
            map.put(i+1,ed-st+1);
            map2.put(i+1,cnt);
        }
        for(int a:map.keySet()){
            if(Objects.equals(map.get(a), Collections.max(map.values()))){
                System.out.println(a);
                break;
            }
        }
        for(int b:map.keySet()){
            if(Objects.equals(map2.get(b), Collections.max(map2.values()))){
                System.out.println(b);
                break;
            }
        }
    }
}
