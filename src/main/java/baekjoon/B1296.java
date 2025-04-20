package baekjoon;

import java.util.*;

public class B1296 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String yd=s.next();
        int N=s.nextInt();
        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < N; i++) {
            String tn=s.next();
            String yt=yd+tn;
            int[] pnt=new int[4];
            for (int j = 0; j < yt.length(); j++) {
                switch (yt.charAt(j)){
                    case 'L':
                        pnt[0]+=1;
                        break;
                    case 'O':
                        pnt[1]+=1;
                        break;
                    case 'V':
                        pnt[2]+=1;
                        break;
                    case 'E':
                        pnt[3]+=1;
                        break;
                }
            }
            int scr=1;
            for (int j = 0; j < 3; j++) {
                for (int k = j+1; k < 4; k++) {
                    scr*=(pnt[j]+pnt[k]);
                }
            }
            scr%=100;
            map.put(tn,scr);
        }
        List<String> list=new ArrayList<>();
        for(String a:map.keySet()){
            if(Objects.equals(map.get(a),Collections.max(map.values()))){
                list.add(a);
            }
        }
        Collections.sort(list);
        System.out.print(list.get(0));
    }
}
