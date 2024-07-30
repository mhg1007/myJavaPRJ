package baekjoon;
import java.util.*;

public class B2839 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int mx=Math.max(N/3,N/5);
        List<Integer> psb=new ArrayList<>();
        for (int i = 0; i <= mx; i++) {
            for (int j = 0; j <= mx; j++) {
                if(i*3+j*5==N){
                    psb.add(i+j);
                }
            }
        }
        if(psb.isEmpty()){
            System.out.print(-1);
        }
        else {
            int[] arr = new int[psb.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = psb.get(i);
            }
            Arrays.sort(arr);
            System.out.print(arr[0]);
        }
    }
}
