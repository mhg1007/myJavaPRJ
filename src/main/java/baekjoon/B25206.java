package baekjoon;
import java.util.Objects;
import java.util.Scanner;
public class B25206 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float hjpj=0;      //(학점X과목평점) 값을 쌓는 변수
        float pg=0;          // 학점총합을 쌓는 변수
        String[] pj= {"A+","A0","B+","B0","C+","C0","D+","D0","F"};

        for (int i = 0; i < 20; i++) {
            String a=s.next();
            float b=s.nextFloat();
            String c=s.next();

            if(Objects.equals(c, pj[0])){
                pg+=b;
                hjpj+=b*4.5;
            }
            else if (Objects.equals(c, pj[1])){
                pg+=b;
                hjpj+=b*4.0;
            }
            else if (Objects.equals(c, pj[2])){
                pg+=b;
                hjpj+=b*3.5;
            }
            else if (Objects.equals(c, pj[3])){
                pg+=b;
                hjpj+=b*3.0;
            }
            else if (Objects.equals(c, pj[4])){
                pg+=b;
                hjpj+=b*2.5;
            }
            else if (Objects.equals(c, pj[5])){
                pg+=b;
                hjpj+=b*2.0;
            }
            else if (Objects.equals(c, pj[6])){
                pg+=b;
                hjpj+=b*1.5;
            }
            else if (Objects.equals(c, pj[7])){
                pg+=b;
                hjpj+= b;
            }
            else if (Objects.equals(c, pj[8])){
                pg+=b;
                hjpj+=0;
            }
            else{
                pg+=0;
                hjpj+=0;
            }

        }

        System.out.print(hjpj/pg);
    }
}
