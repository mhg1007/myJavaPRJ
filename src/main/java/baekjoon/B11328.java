package baekjoon;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class B11328 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for (int i = 0; i < N; i++) {
            String[] ar1=s.next().split("");
            String[] ar2=s.next().split("");
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            boolean chk=true;
            if(ar1.length!=ar2.length){
                chk=false;
            }
            else{
                for (int j = 0; j < ar1.length; j++) {
                    if (!Objects.equals(ar1[j], ar2[j])) {
                        chk = false;
                        break;
                    }
                }
            }
            System.out.println(chk?"Possible":"Impossible");
        }
    }
}
