package programmers;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("홀수면 n 이하의 홀수인 모든 양수의 합");
        System.out.println("짝수면 n 이하의 짝수인 모든 양수의 제곱의 합");
        System.out.print("양의 정수 n을 입력하세요: ");
        int n=s.nextInt();
        System.out.println("결과: "+solution1(n));

    }
    public static int solution1(int n) {
        int answer = 0;
        if(n%2!=0){
            for(int i=n; i>0; i=i-2){
                answer+=i;
            }
        }
        else{
            for(int i=n; i>0; i=i-2){
                answer+=i*i;
            }
        }
        return answer;
    }
}
