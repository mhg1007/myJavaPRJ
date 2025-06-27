package baekjoon;

import java.util.*;

public class B2596 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Map<String,String> map=Map.of("000000","A","001111","B","010011","C","011100","D","100110","E","101001","F","110101","G","111010","H");
        List<String> list=new ArrayList<>(Arrays.asList("000000","001111","010011","011100","100110","101001","110101","111010"));
        int N=s.nextInt();
        String[] arr=new String[N];
        String ln=s.next();
        for (int i = 0; i < N; i++) {
            arr[i]=ln.substring(0,6);
            ln=ln.substring(6);
        }
        StringBuilder sb=new StringBuilder();
        boolean flag=true;
        for (int i = 0; i < N; i++) {
            int cnt=0;
            for (String a : list) {
                int df = 0;
                for (int k = 0; k < 6; k++) {
                    if (arr[i].charAt(k) != a.charAt(k)) {
                        df++;
                    }
                }
                if (df < 2) {
                    cnt++;
                    sb.append(map.get(a));
                    break;
                }
            }
            if(cnt==0){
                flag=false;
                System.out.print(i+1);
                break;
            }
        }
        if(flag){
            System.out.print(sb);
        }

    }
}
