package baekjoon;

import java.util.*;

public class B4775 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        Set<String> set=new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(s.next());
        }
        int M=s.nextInt();
        for (int i = 1; i <= M; i++) {
            List<String> list=new ArrayList<>();
            while(true){
                String mw=s.next();
                if(mw.equals("-1")){
                    break;
                }
                if(!set.contains(mw)){
                    list.add(mw);
                }
            }
            StringBuilder sb = new StringBuilder("Email ");
            sb.append(i).append(" is ");
            if(list.isEmpty()){
                sb.append("spelled correctly.");
            }
            else{
                sb.append("not spelled correctly.");
                for(String a:list){
                    sb.append('\n').append(a);
                }
            }
            System.out.println(sb);
        }
        System.out.print("End of Output");
    }
}
