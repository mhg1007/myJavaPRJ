package baekjoon;

import java.util.*;

public class B1969 {
    public static int hamdis(String a, String b){
        int sum=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i)){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        char[][] arr=new char[N][M];
        for (int i = 0; i < N; i++) {
            String dna=s.next();
            arr[i]=dna.toCharArray();
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < M; i++) {
            HashMap<Character,Integer> map=new HashMap<>();
            for (int j = 0; j < N; j++) {
                char chk=arr[j][i];
                if(map.containsKey(chk)){
                    int ov=map.get(chk);
                    map.replace(chk,ov,ov+1);
                }
                else{
                    map.put(chk,1);
                }
            }
            List<Character> list=new ArrayList<>();
            int max= Collections.max(map.values());
            for(Character a:map.keySet()){
                if(map.get(a)==max){
                    list.add(a);
                }
            }
            Collections.sort(list);
            sb.append(list.get(0));
        }
        String dmd=sb.toString();
        int sum=0;
        for (int i = 0; i < N; i++) {
            String dcd=new String(arr[i]);
            sum+=hamdis(dmd,dcd);
        }
        System.out.print(dmd+"\n"+sum);
    }
}
