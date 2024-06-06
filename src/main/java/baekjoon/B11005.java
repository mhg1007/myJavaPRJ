package baekjoon;
import java.util.Scanner;
public class B11005 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();      //입력받는 변환할 숫자
        int B=s.nextInt();      //입력받는 진법 수
        char midrdx;            //진수변환 중간변수
        String rdx="";          //최종 진수변환 값
        while(N>0){             //
            int nmj=N%B;        //나머지 값을 변수로 지정
            //아스키코드값으로 변환하여 문자로 바꿈
            if (nmj<10) {       //나머지가 10미만이면
                midrdx = (char) (nmj + 48); //숫자로(0~9: 48~57)
            }
            else{               //10이상이면
                midrdx = (char) (nmj + 55); //알파벳으로(A~Z: 65~90)
            }
            rdx=midrdx+rdx;     //중간 변수 값을 앞쪽에 더함
            N=(N-nmj)/B;        //원래값에서 나머지를 빼고 진수값으로 나눠줌
        }
        System.out.print(rdx);
    }
}
