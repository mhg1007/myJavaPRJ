package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B4690 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            List<String> list=new ArrayList<>();
            for (int j = 2; j <= 100; j++) {
                for (int k = 2; k <= 100; k++) {
                    for (int l = 2; l <= 100; l++) {
                        if(i*i*i==j*j*j+k*k*k+l*l*l){
                            int[] arr={j,k,l};
                            Arrays.sort(arr);
                            StringBuilder sb=new StringBuilder();
                            sb.append("(");
                            for(int a:arr){
                                sb.append(a).append(",");
                            }
                            sb.setLength(sb.length()-1);
                            sb.append(")");
                            String trp=sb.toString();
                            if(!list.contains(trp)){
                                list.add(trp);
                            }
                        }
                    }
                }
            }
            for (String a:list) {
                System.out.printf("Cube = %d, Triple = %s\n",i,a);
            }
        }
    }
}
