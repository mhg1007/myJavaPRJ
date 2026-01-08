package baekjoon;

import java.util.Scanner;

public class B16205 {
    public static String cmsn(String a){
        if(a.contains("_")){
            while(a.contains("_")){
                int idx=a.indexOf("_");
                char c=a.charAt(idx+1);
                a=a.substring(0,idx)+Character.toUpperCase(c)+a.substring(idx+2);
            }
        }
        else{
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < a.length(); i++) {
                char c=a.charAt(i);
                if(Character.isUpperCase(c)){
                    sb.append("_").append(Character.toLowerCase(c));
                }
                else{
                    sb.append(c);
                }
            }
            a=sb.toString();
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=s.next();
        String[] a=new String[3];
        switch (n){
            case 1:
                a[0]=str;
                a[1]=cmsn(str);
                a[2]=Character.toUpperCase(str.charAt(0))+str.substring(1);
                break;
            case 2:
                a[1]=str;
                a[0]=cmsn(str);
                a[2]=Character.toUpperCase(a[0].charAt(0))+a[0].substring(1);
                break;
            case 3:
                a[2]=str;
                a[0]=Character.toLowerCase(str.charAt(0))+str.substring(1);
                a[1]=cmsn(a[0]);
                break;
        }
        System.out.print(a[0]+"\n"+a[1]+"\n"+a[2]);
    }
}
