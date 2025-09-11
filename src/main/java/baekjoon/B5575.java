package baekjoon;

import java.util.Scanner;

public class B5575 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int h1=s.nextInt();
            int m1=s.nextInt();
            int s1=s.nextInt();
            int h2=s.nextInt();
            int m2=s.nextInt();
            int s2=s.nextInt();

            int h3=h2-h1;
            int m3=m2-m1;
            int s3=s2-s1;

            if(s3<0){
                m3--;
                s3+=60;
            }
            if(m3<0){
                h3--;
                m3+=60;
            }
            System.out.println(h3+" "+m3+" "+s3);
        }
    }
}
