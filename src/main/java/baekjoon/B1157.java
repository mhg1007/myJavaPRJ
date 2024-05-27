package baekjoon;
import java.util.Scanner;
public class B1157 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.next();
        String SS=S.toUpperCase(); //입력받은 원본문자를 모두 대문자로 바꿔놓음
        String SSS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";    //모든 알파벳이 있는 SSS
        int[] scnt=new int[SSS.length()];           //알파벳의 갯수를 저장할 배열을 생성
        for(int h:scnt){                            //모든 값을 0으로 채워놓음
            h=0;
        }
        /*원본문자에 포함되는 알파벳 갯수 저장
        (SS의 각 자리의 문자와 SSS의 모든 알파벳을 비교하여
        있는 알파벳의 자리(scnt)에 1을 더해놓음*/
        for(int i=0; i<SS.length(); i++){
            for (int j = 0; j < SSS.length(); j++) {
                if (SS.charAt(i)==SSS.charAt(j)){
                    scnt[j]++;
                }
            }
        }
        int max=scnt[0];    //최대값의 수치를 저장할 변수 생성, 배열 scnt의 첫 값으로 시작
        int maxi=0;        //최대값의 위치를 저장할 변수 생성
        for (int i = 1; i < SSS.length(); i++) {
            if(scnt[i]>max){                //최대값으로 지정해놓은 max보다 큰 값이 있다면
                max=scnt[i];                //max의 값을 교체
                maxi=i;                    //maxi에 그 값의 자리값을 저장
            }
            else if (scnt[i]==max) {       //만약 최대값과 동일한 값이 있다면
                maxi=-1;                    //물음표를 출력하기 위해 음수를 저장
            }
        }
        if (maxi>=0){                             //자리값이 0포함 양수라면
            System.out.print(SSS.charAt(maxi));    //그 자리값의 알파벳을 출력함
        }
        else {                            //음수일 경우는 최대값이 겹친다는 뜻
            System.out.print("?");        //물음표를 출력
        }
    }
}
