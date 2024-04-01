import java.util.Scanner;

public class Code05_p {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("값 입력 : ");
        int a=s.nextInt();

        if (a%15==0) {
            System.out.println("3의 배수, 5의 배수 모두 만족합니다.");
        }
        else if (a%3==0) {
            System.out.println("3의 배수입니다.");
        }
        else if (a%5==0) {
            System.out.println("5의 배수입니다.");
        }
        else{
            System.out.println("3의 배수, 5의 배수 모두 만족하지 않습니다");
        }


    }

}
