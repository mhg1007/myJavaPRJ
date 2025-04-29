package baekjoon;

import java.util.*;

public class B1380 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int seq=1;
        while(true){
            int n=s.nextInt();
            if(n==0)break;
            Map<Integer,String> map=new HashMap<>();
            String fk= s.nextLine();
            for (int i = 0; i < n; i++) {
                map.put(i+1,s.nextLine());
            }
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < n*2-1; i++) {
                int nn=s.nextInt();
                String ab=s.next();
                if(list.contains(nn)){
                    list.remove((Integer) nn);
                }
                else{
                    list.add(nn);
                }
            }
            System.out.println(seq+" "+map.get(list.get(0)));
            seq++;
        }
    }
}
