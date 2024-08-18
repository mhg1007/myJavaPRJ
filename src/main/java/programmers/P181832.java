package programmers;

public class P181832 {  //정수를 나선형으로 배치하기
   public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num=1;
        int xpos=0, ypos=0;
        int xmin=0, xmax=n-1;
        int ymin=0, ymax=n-1;
        while(num<=n*n){
            int tmp=0;
            
            for(int i=ypos; i<=ymax; i++){
                answer[xpos][i]=num++;
                if(num>n*n){break;}
                tmp=i;
            }
            ypos=tmp;
            xpos++;
            xmin++;
            
            for(int i=xpos; i<=xmax; i++){
                answer[i][ypos]=num++;
                if(num>n*n){break;}
                tmp=i;
            }
            xpos=tmp;
            ypos--;
            ymax--;
            
            for(int i=ypos; i>=ymin; i--){
                answer[xpos][i]=num++;
                if(num>n*n){break;}
                tmp=i;
            }
            ypos=tmp;
            xpos--;
            xmax--;
            
            for(int i=xpos; i>=xmin; i--){
                answer[i][ypos]=num++;
                if(num>n*n){break;}
                tmp=i;
            }
            xpos=tmp;
            ypos++;
            ymin++;
        }
        return answer;
    }

    public static void main(String[] args) {
    }
}
