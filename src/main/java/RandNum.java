import java.util.*;

public class RandNum {
    public static void main(String[] args) {
        Random r=new Random();
        List<List<Integer>> list2=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Set<Integer> set=new HashSet<>();
            List<Integer> list=new ArrayList<>();
            r.setSeed(System.nanoTime()-System.currentTimeMillis());
            while(list.size()<6){
                int nxt=r.nextInt(45)+1;
                if(set.contains(nxt)&&!list.contains(nxt)){
                    list.add(nxt);
                }
                else{
                    set.add(nxt);
                }
            }
            Collections.sort(list);
            list2.add(list);
        }
        list2.sort((o1, o2) -> {
            int idx = 0;
            while (Objects.equals(o1.get(idx), o2.get(idx))) {
                idx++;
            }
            return o1.get(idx) - o2.get(idx);
        });
        StringBuilder sb=new StringBuilder();
        for(List<Integer> l:list2){
            for(Integer nxt:l){
                sb.append(nxt < 10 ? "0" : "").append(nxt).append(" ");
            }
            sb.append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
