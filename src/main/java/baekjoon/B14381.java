package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B14381 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int i = 0; i < T; i++) {
            int N=s.nextInt();
            int mlt=0,lst=0;    //곱하는 수, 마지막 수
            boolean chk=false;
            boolean[] arr=new boolean[10];
            Arrays.fill(arr,false);
            while(N!=0 && !chk){
                mlt++;
                int mind=N*mlt;
                String str=String.valueOf(mind);
                for (int j = 0; j < str.length(); j++) {
                    int dvd=Character.getNumericValue(str.charAt(j));
                    if(!arr[dvd]){
                        arr[dvd]=true;
                    }
                }
                boolean dpchk=true;
                for(boolean c:arr){
                    if (!c) {
                        dpchk = false;
                        break;
                    }
                }
                if(dpchk){
                    chk=true;
                    lst=mind;
                }
            }
            String answer="Case #"+(i+1)+": ";
            answer += N==0?"INSOMNIA":lst;
            System.out.println(answer);
        }
    }
}
