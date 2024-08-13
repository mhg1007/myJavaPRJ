package baekjoon;
import java.util.*;
public class B1620 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        Map<String,String> pkm=new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name=s.next();
            pkm.put(String.valueOf(i+1),name);
            pkm.put(name,String.valueOf(i+1));
        }
        for (int i = 0; i < M; i++) {
            String find=s.next();
            System.out.println(pkm.get(find));
        }
    }
}
