package baekjoon;
import java.util.Scanner;
public class B2903 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //n번째 시행결과의 숫자의 규칙성을 보았을때
        //시행결과는 0번:4, 1번:9, 2번:25, 3번:81, 4번:289, 5번:1089, ... 과 같고
        //규칙성은 2의제곱,3의제곱,5의제곱,9의제곱,17의제곱,33의제곱,... 의 순으로 이어진다
        //제곱되는 수의 값은 2부터 시작해서 2의(n-1)제곱이 더해지는 것을 알 수 있다
        //규칙성을 for문을 사용하여 구현해보았다
        int N=s.nextInt();
        int P=2;
        for (int i = 1; i <= N; i++) {
            P+=(int)Math.pow(2,i-1);
        }
        System.out.print((int)Math.pow(P,2));
    }
}
