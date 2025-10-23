package baekjoon;

import java.util.*;

public class B9322 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int n=s.nextInt();
            List<String> list = new ArrayList<>();
            Map<Integer,Integer> map=new HashMap<>();
            for (int j = 0; j < n; j++) {
                list.add(s.next());
            }
            for (int j = 0; j < n; j++) {
                map.put(j,list.indexOf(s.next()));
            }
            String[] arr=new String[n];
            for (int j = 0; j < n; j++) {
                arr[map.get(j)]=s.next();
            }
            StringBuilder sb = new StringBuilder();
            for(String wd:arr){
                sb.append(wd).append(" ");
            }
            sb.setLength(sb.length()-1);
            System.out.println(sb);
        }
    }
}
