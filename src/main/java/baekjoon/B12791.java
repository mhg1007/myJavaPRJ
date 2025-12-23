package baekjoon;

import java.util.List;
import java.util.Scanner;

public class B12791 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> list=List.of(1967,1969,1970,1971,1972,1973,1973,1974,1975,1976,1977,1977,1979,1980,1983,1984,1987,1993,1995,1997,1999,2002,2003,2013,2016);
        List<String> list2=List.of("DavidBowie","SpaceOddity","TheManWhoSoldTheWorld","HunkyDory","TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars","AladdinSane","PinUps","DiamondDogs","YoungAmericans","StationToStation","Low","Heroes","Lodger","ScaryMonstersAndSuperCreeps","LetsDance","Tonight","NeverLetMeDown","BlackTieWhiteNoise","1.Outside","Earthling","Hours","Heathen","Reality","TheNextDay","BlackStar");
        int Q=s.nextInt();
        for (int i = 0; i < Q; i++) {
            int S=s.nextInt();
            int E=s.nextInt();
            int sum=0;
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j)>=S && list.get(j)<=E){
                    sum++;
                    sb.append(list.get(j)).append(" ").append(list2.get(j)).append("\n");
                }
            }
            if(sb.length()>0){
                sb.setLength(sb.length()-1);
            }
            System.out.println(sum);
            if(sum!=0) {
                System.out.println(sb);
            }
        }
    }
}
