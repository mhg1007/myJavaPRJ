package baekjoon;
import java.util.Scanner;
public class B1193 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int i=0,j=1,l=2;    //변수 초기화
        if(X==1)
            System.out.print("1/1");
        while(l<=X){ //주어진 값까지 규칙성을 반복
            if(i==0) {
                for (; j>=0; i++,j--) {
                    if(l==X){
                        System.out.print((i+1)+"/"+(j+1));
                    }
                    l++;
                }
                i--;    //j가 0일때도 증감하는것을 되돌림
                j++;    //상동
            }
            else if (j==0) {
                for(; i>=0;i--,j++){
                    if(l==X){
                        System.out.print((i+1)+"/"+(j+1));
                    }
                    l++;
                }
                i++;    //i가 0일때도 증감하는것을 되돌림
                j--;    //상동
            }
            if(i==0){
                j++;
            }
            else if(j==0){
                i++;
            }
        }
    }
}
