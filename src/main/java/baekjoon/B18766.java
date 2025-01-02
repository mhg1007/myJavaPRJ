package baekjoon;

import java.util.*;

public class B18766 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0; i<T; i++){
            int n=s.nextInt();
            List<String> rem=new ArrayList<>();
            List<String> res=new ArrayList<>();
            for(int j=0; j<n; j++){
                rem.add(s.next());
            }
            for(int j=0; j<n; j++){
                res.add(s.next());
            }
            Collections.sort(rem);
            Collections.sort(res);
            if(Arrays.equals(rem.toArray(),res.toArray())){
                System.out.println("NOT CHEATER");
            }
            else{
                System.out.println("CHEATER");
            }
        }
    }
}
