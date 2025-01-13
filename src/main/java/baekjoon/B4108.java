package baekjoon;

import java.util.Scanner;

public class B4108 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            int R=s.nextInt();
            int C=s.nextInt();
            if(R==0&&C==0){
                break;
            }
            char[][] arr=new char[R][C];
            for (int i = 0; i < R; i++) {
                String mf=s.next();
                for (int j = 0; j < C; j++) {
                    arr[i][j]=mf.charAt(j);
                }
            }
            String[] arr2=new String[R];
            for (int i = 0; i < R; i++) {
                StringBuilder sb=new StringBuilder();
                for (int j = 0; j < C; j++) {
                    char pnt=arr[i][j];
                    if(pnt=='.'){
                        int chk=0;
                        for (int k = i-1; k <= i+1 ; k++) {
                            for (int l = j - 1; l <= j + 1; l++) {
                                if((k>=0 && k<R) && (l>=0 && l<C)) {
                                    if(arr[k][l]=='*'){
                                        chk++;
                                    }
                                }
                            }
                        }
                        sb.append(chk);
                    }
                    else if (pnt=='*') {
                        sb.append(pnt);
                    }
                }
                arr2[i]=sb.toString();
            }
            for(String swp: arr2){
                System.out.println(swp);
            }
        }
    }
}
