package programmers;
import java.util.*;

public class P181916 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p=0, q=0,pos=0;
        int[] roll={a,b,c,d};
        Arrays.sort(roll);
        List<Integer> list=new ArrayList<>();
        list.add(roll[0]);
        for(int i=1; i<4; i++){
            if(roll[i-1] != roll[i]){
                list.add(roll[i]);
            }
            else{
                pos=i;
            }
        }
        switch(list.size()){
            case 1:
                answer=roll[0]*1111;
                break;
            case 2:
                if(roll[1]!=roll[2]){
                    answer=(roll[1]+roll[2])*(roll[2]-roll[1]);
                }
                else{
                    if(pos==2){
                        p=roll[0];
                        q=roll[3];
                    }
                    else if(pos==3){
                        p=roll[3];
                        q=roll[0];
                    }
                    int e=(10*p+q);
                    answer=e*e;
                }
                break;
            case 3:
                if(pos==1){
                    answer=roll[2]*roll[3];
                }
                else if(pos==2){
                    answer=roll[0]*roll[3];
                }
                else if(pos==3){
                    answer=roll[0]*roll[1];
                }
                break;
            case 4:
                answer=roll[0];
                break;
        }
        return answer;
    }
  
    public static void main(String[] args) {
      int a1=2, b1=2, c1=2, d1=2, ans1=2222;
      int a2=4, b2=1, c2=4, d2=4, ans2=1681;
      int a3=6, b3=3, c3=3, d3=6, ans3=27;
      int a4=2, b4=5, c4=2, d4=6, ans4=30;
      int a5=6, b5=4, c5=2, d5=5, ans5=2;
    }
}
