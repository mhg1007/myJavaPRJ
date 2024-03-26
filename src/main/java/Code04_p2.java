import java.util.Scanner;
public class Code04_p2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a;
        int b=0;

        System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : ");
        a=s.nextInt();

        System.out.print("값 입력: ");
        switch (a) {
            case 1:
                b = s.nextInt();
                break;

            case 2:
                b = s.nextInt(16);
                break;

            case 3:
                b = s.nextInt(8);
                break;
        }

        System.out.printf("10진수 ==> %d \n",b);
        System.out.printf("16진수 ==> %x \n",b);
        System.out.printf("8진수 ==> %o \n",b);
    }
}
