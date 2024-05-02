package baekjoon;
import java.util.Scanner;
public class B1546 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        double[] score=new double[N];
        for (int i=0; i<N; i++){
            score[i]=s.nextInt();
        }
        double maxScore=score[0];
        for(int i=1; i<N; i++){
            if(score[i]>maxScore)
                maxScore=score[i];
        }
        double newAvg=0;
        for (int i=0; i<N; i++) {
            score[i]=(score[i]/maxScore)*100;
            newAvg+=score[i];
        }
        System.out.print(newAvg/N);
    }
}
