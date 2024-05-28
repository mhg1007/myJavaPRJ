package baekjoon;
import java.util.Scanner;
public class B1316 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int grCntCnt=0;     //그룹단어의 갯수
        for (int i = 0; i < N; i++) {
            int grCnt=0;    //그룹단어인지 체크용 변수
            String str=s.next();

            if (str.length()==1) {  //길이가 1이면 무조건 그룹문자 포함
                grCntCnt++;
            }
            else {
                for (int j = 0; j < str.length() - 1; j++) {    //j가 0부터 str길이-2까지 반복
                    if (str.charAt(j) != str.charAt(j + 1)) {   //str의 charAt(j)값이 다음번글자와 달라질때마다
                        grCnt--;                                //grCnt의 값을 감소
                        if(str.indexOf(str.charAt(j),j+1)==-1){ //다음번에 같은 글자가 나오지 않으면 다시 복구
                            grCnt++;                                     //(=그룹단어가 맞음)
                        }
                    }
                }
                if(grCnt>=0) {      //그룹단어가 맞을경우에만 그룹단어갯수에 +1
                    grCntCnt++;
                }
            }
        }
        System.out.print(grCntCnt);
    }
}
