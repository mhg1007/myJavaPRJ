package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class B10816 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < N; i++) {
            int crd=s.nextInt();
            if(map.containsKey(crd)){
                int odk=map.get(crd);
                map.replace(crd,odk,odk+1);
            }
            else{
                map.put(crd,1);
            }
        }
        int M=s.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < M; i++) {
            int fnd=s.nextInt();
            sb.append(map.getOrDefault(fnd, 0)).append(" ");
        }
        System.out.print(sb);
    }
}
