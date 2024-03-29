import java.util.Scanner;

public class Lab03_01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("파운드(lb)/킬로그램(kg)을 입력하세요: 예시) 37 lb");
        String weightStr=s.next();
        double chWeight,weightDouble;
        weightStr=weightStr.replaceAll(" ",""); /*입력값 공백 제거*/

        if (weightStr.indexOf("lb")>=0){ /*lb로 입력했을 때 kg로 변환*/
            weightStr=weightStr.replaceAll("lb","");
            weightDouble=Double.parseDouble(weightStr);
            chWeight=weightDouble*0.453592;
            chWeight=Math.round(chWeight*1000.0)/1000.0;
            weightDouble=Math.round(weightDouble*1000.0)/1000.0;
            System.out.println(weightDouble+"파운드(lb)는 "+chWeight+"킬로그램(kg) 입니다.");
        }
        else { /*kg로 입력했을떄 lb로 변환*/
            weightStr=weightStr.replaceAll("kg","");
            weightDouble=Double.parseDouble(weightStr);
            chWeight=weightDouble*2.204623;
            chWeight=Math.round(chWeight*1000.0)/1000.0;
            weightDouble=Math.round(weightDouble*1000.0)/1000.0;
            System.out.println(weightDouble+"킬로그램(kg)은 "+chWeight+"파운드(lb) 입니다.");
        }

        s.close();

    }
}
