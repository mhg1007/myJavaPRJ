package baekjoon;
import java.util.Scanner;
public class B2563 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int count=s.nextInt();
        int[][] arr=new int[100][100];    //도화지 영역을 이차원 배열로 표현
        int area=0;                        //넓이를 계산할 변수 지정
        for (int i = 0; i < count; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            for (int j = a; j <a+10 ; j++) {
                for (int k = b; k <b+10; k++) {
                    arr[j][k]+=1;        //색종이 넓이만큼 배열 arr에 더함
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {    //이차원 배열의 모든 값에 대하여
                if(arr[i][j]>=1){        //숫자에 상관없이(중복되는 영역도 1로 셈=중복 제거)
                    area++;            //색종이 영역 넓이를 계산
                }
            }
        }
        System.out.print(area);
    }
}
