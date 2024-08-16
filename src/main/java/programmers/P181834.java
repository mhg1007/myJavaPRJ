package programmers;

public class P181834 {  //l로 만들기
   public String solution(String a) {
        for(int i=0; i<a.length(); i++){
            if((int)a.charAt(i)<(int)'l'){
                a=a.replaceAll(String.valueOf(a.charAt(i)),"l");
            }
        }
        return a;
    }

    public static void main(String[] args) {
    }
}
