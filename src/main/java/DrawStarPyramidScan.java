import java.util.Scanner;
public class DrawStarPyramidScan {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("줄 수를 입력하세요: ");
        int k=s.nextInt();

        for (int i=0; i<k; i++){
            for(int j=1; j<(k*2); j++){
                if (j>(k-1-i)&&j<(i+k+1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
