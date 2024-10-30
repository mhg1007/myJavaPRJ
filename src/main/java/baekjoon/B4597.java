package baekjoon;
import java.util.Scanner;
public class B4597 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            String str=s.next();
            if(str.equals("#")){
                break;
            }
            char prt=str.charAt(str.length()-1);
            int count=0;
            for (int i = 0; i < str.length()-1; i++) {
                if(str.charAt(i)=='1'){
                    count++;
                }
            }
            String ch=str.substring(0,str.length()-1);
            switch (prt) {
                case 'e':
                    if (count%2==0){
                        ch+="0";
                    }
                    else {
                        ch+="1";
                    }
                    break;
                case 'o':
                    if (count%2==0){
                        ch+="1";
                    }
                    else {
                        ch+="0";
                    }
                    break;
            }
            System.out.println(ch);
        }
    }
}
