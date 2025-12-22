package baekjoon;

import java.util.*;

public class B34125 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Map<int[],Integer> map=new HashMap<>();
        int n=s.nextInt(),m=s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int c=s.nextInt();
                if(c!=1) {
                    int[] a=new int[]{i+1,j+1};
                    int d=i+1+Math.abs((m+1)/2-(j+1));
                    map.put(a,d);
                }
            }
        }
        if(map.isEmpty()) {
            System.out.print(-1);
        }
        else{
            for(int[] a:map.keySet()){
                if(Objects.equals(map.get(a), Collections.min(map.values()))){
                    System.out.print(a[0]+" "+a[1]);
                    break;
                }
            }
        }
    }
}
