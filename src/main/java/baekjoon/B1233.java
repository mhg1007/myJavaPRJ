package baekjoon;

import java.util.*;

public class B1233 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int S1=s.nextInt();
        int S2=s.nextInt();
        int S3=s.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    int sum=i+j+k;
                    if(map.containsKey(sum)){
                        int ov=map.get(sum);
                        map.replace(sum,ov,ov+1);
                    }
                    else{
                        map.put(sum,1);
                    }
                }
            }
        }
        for(int a:map.keySet()){
            if(Objects.equals(map.get(a), Collections.max(map.values()))){
                System.out.print(a);
                break;
            }
        }
    }
}
