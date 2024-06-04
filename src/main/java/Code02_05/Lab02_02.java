package Code02_05;

import java.util.Scanner;
public class Lab02_02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("BMI 계산기");
        System.out.print("몸무게(kg): ");
        String weight=s.nextLine();
        System.out.print("키(cm): ");
        String height=s.nextLine();

        double w=Double.parseDouble(weight);
        double h=Double.parseDouble(height);
        h/=100;

        double bmi=w/(h*h);
        bmi=(int)(bmi*100)/100.0;

        if (bmi<18.5) {
            System.out.println("키:" + height + "cm / 몸무게:" + weight + "kg");
            System.out.println("BMI:" + bmi);
            System.out.println("저체중");
            }

            else if(bmi<23){
                System.out.println("키:"+height+"cm / 몸무게:"+weight+"kg");
                System.out.println("BMI:"+bmi);
                System.out.println("정상체중");
            }

            else if(bmi<25){
            System.out.println("키:"+height+"cm / 몸무게:"+weight+"kg");
            System.out.println("BMI:"+bmi);
            System.out.println("과체중");
            }

            else if(bmi<30){
            System.out.println("키:"+height+"cm / 몸무게:"+weight+"kg");
            System.out.println("BMI:"+bmi);
            System.out.println("경도비만");
            }

            else if(bmi<35){
            System.out.println("키:"+height+"cm / 몸무게:"+weight+"kg");
            System.out.println("BMI:"+bmi);
            System.out.println("중등도비만");
            }

            else {
            System.out.println("키:"+height+"cm / 몸무게:"+weight+"kg");
            System.out.println("BMI:"+bmi);
            System.out.println("고도비만");
            }

        s.close();

    }
}
