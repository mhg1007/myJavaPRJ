package baekjoon;

import java.util.Scanner;

public class B13223 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String[] ar1=a.split(":");
        String b=s.nextLine();
        String[] ar2=b.split(":");
        int[] ar3=new int[3];
        for (int i = 0; i < 3; i++) {
            ar3[i]=Integer.parseInt(ar2[i])-Integer.parseInt(ar1[i]);
        }
        if(ar3[2]<0){
            ar3[2]+=60;
            ar3[1]-=1;
        }
        if(ar3[1]<0){
            ar3[1]+=60;
            ar3[0]-=1;
        }
        if(ar3[0]<0){
            ar3[0]+=24;
        }
        if(ar3[0]==0 && ar3[1]==0 && ar3[2]==0){
            ar3[0]=24;
        }
        System.out.printf("%02d:%02d:%02d",ar3[0],ar3[1],ar3[2]);
    }
}
