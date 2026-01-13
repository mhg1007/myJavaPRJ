package baekjoon;

import java.util.Scanner;

public class B19572 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d1=s.nextInt();
        int d2=s.nextInt();
        int d3=s.nextInt();
        /*
        a+b=d1, a+c=d2, b+c=d3
        a+b+c=(d1+d2+d3)/2

        d1+d2-d3=2a
        d1-d2+d3=2b
        -d1+d2+d3=2c

        a,b,c가 모두 양의 실수가 되려면
        d1,d2,d3 세 숫자 중 2개를 더하고
        나머지 하나를 뺐을 때 양수가 되어야 함
         */
        double a=(d1+d2-d3)/2.0;
        double b=(d1-d2+d3)/2.0;
        double c=(-d1+d2+d3)/2.0;

        if(a<=0 || b<=0 || c<=0){
            System.out.print(-1);
        }
        else{
            System.out.println(1);
            System.out.printf("%.1f %.1f %.1f",a,b,c);
        }
    }
}
