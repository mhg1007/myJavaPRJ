package baekjoon;

public class B6679 {
    public static void main(String[] args) {
        for (int i = 2992; i < 10000; i++) {
            String a=String.valueOf(i);
            String b=Integer.toString(i,12);
            String c=Integer.toString(i,16);
            int as=0,bs=0,cs=0;
            for (int j = 0; j < a.length(); j++) {
                as+=Character.getNumericValue(a.charAt(j));
            }
            for (int j = 0; j < b.length(); j++) {
                bs+=Character.getNumericValue(b.charAt(j));
            }
            for (int j = 0; j < c.length(); j++) {
                cs+=Character.getNumericValue(c.charAt(j));
            }
            if(as==bs&&bs==cs){
                System.out.println(i);
            }
        }
    }
}
