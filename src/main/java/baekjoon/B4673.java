package baekjoon;

public class B4673 {
    public static void main(String[] args) {
        int n=1;
        while(n<10000){
            int check=0;
            for (int i = 0; i < n; i++) {
                if(SelfNumber(i)==n){
                    check++;
                }
            }
            if(check==0){
                System.out.println(n);
            }
            n++;
        }
    }
    public static int SelfNumber(int n){
        int dn=n;
        String ns=String.valueOf(n);
        for (int i=0;i<ns.length();i++) {
            dn+=Integer.parseInt(String.valueOf(ns.charAt(i)));
        }
        return dn;
    }
}
