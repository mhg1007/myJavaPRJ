import java.util.Scanner;

public class Code06_03_q {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("시작값 ==> ");
        int a=s.nextInt();

        System.out.print("끝값 ==> ");
        int b=s.nextInt();

        if (a<b) {
            for(int i=a;i<=b;i++){
                if(i%3!=0)
                    continue;
                System.out.println(i);
            }
        }
        else if(a>b){
            for(int i=a;i>=b;i--){
                if(i%3!=0)
                    continue;
                System.out.println(i);
            }
        }
        else{
            System.out.println("시작값과 끝값이 같습니다.");
        }
    }
}
