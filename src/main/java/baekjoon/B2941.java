package baekjoon;
import java.util.Scanner;
public class B2941 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] crAb={"c=","c-","dz=","d-","lj","nj","s=","z="};   //크로아티안 알파벳의 배열 생성
        String str=s.nextLine();    //원본 문자열 입력받음
        for (String string : crAb) {        //모든 배열의 원소에 대하여
            if (str.contains(string)) {     //크로아티안 알파벳이 포함되어있으면
                str=str.replaceAll(string," ");     //전부 공백으로 변환
            }
        }
        System.out.print(str.length());     //바뀐 문자열의 길이 출력
    }
}
