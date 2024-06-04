package Code02_05;

import java.util.Scanner;
public class Lab04_02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("원본 영문 입력: ");
        String orgStr= s.next();    //원본영문입력
        String chgStr="";           //변환후문자열생성
        int lenStr=orgStr.length(); //문자길이확인

        for (int i=0; i<lenStr; i++){       //i는 0부터 문자끝까지
            char subStr=orgStr.charAt(i);   //문자를 하나씩 뽑아내서(isUpperCase메서드가 char형만 받음)

            if (Character.isUpperCase(subStr)){                 //뽑아낸 문자열이 대문자라면
                chgStr+=orgStr.substring(i,i+1).toLowerCase();  //소문자로 변환해서 변환 후 문자열에 연결
            }
            else{                                               //뽑아낸 문자열이 소문자라면
                chgStr+=orgStr.substring(i,i+1).toUpperCase();  //대문자로 변환해서 변환 후 문자열에 연결
            }
        }

        System.out.println("변환 후 문자열: "+chgStr);
        s.close();

    }
}
