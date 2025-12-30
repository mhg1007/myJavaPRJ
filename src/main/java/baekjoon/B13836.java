package baekjoon;

import java.util.*;

public class B13836 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int a=s.nextInt();
            int b=s.nextInt();
            if(a==0 && b==0) break;
            List<Integer> list=new ArrayList<>();
            for (int i = 1; i <= Math.sqrt(a); i++) {
                if(a%i==0){
                    int a1=i;
                    int a2=a/i;
                    for (int j = 1; j <= Math.sqrt(b); j++) {
                        if(b%j==0){
                            int[] arr={a1,a2,j,b/j};
                            Arrays.sort(arr);
                            int sqs=0;
                            for (int k = 3; k > 0; k--) {
                                int sq=arr[k]-arr[k-1];
                                sqs+=sq*sq;
                            }
                            list.add(sqs);
                        }
                    }
                }
            }
            System.out.println(Collections.min(list));
        }
    }
}
