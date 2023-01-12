package arrays;/* 
  @created 30/09/22
  @author  manish.mandora
*/

import java.util.*;
import java.util.stream.Collectors;

public class MaxFreQ {
    public  int getMaxFreqDeviation(String s) {
        int maxFreqDeviation=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            if(length-i > maxFreqDeviation){
                break;
            }
            String s1=s.substring(i,length);
            String s2=s.substring(i,length-i);
            int a=getMaxFreqDeviation(s1);
            int b=getMaxFreqDeviation(s2);
            maxFreqDeviation=Math.max(a, b);
        }
        return maxFreqDeviation;
    }

    public static int getDev(Map<String, Integer> devEntries){
        List<Integer> entries = devEntries.entrySet().stream()
                .map(x->x.getValue())
                .collect(Collectors.toList());
        Comparator<Integer> collect = Comparator.naturalOrder();
        Collections.sort(entries,collect.reversed());
        return entries.get(0) - entries.get( entries.size()-1);
    }
    public static int getMaxFreqDeviation(String s, Set<Integer> deviations ) {
        for (int x=0;x<s.length();x++) {
            for (int g=x;g<s.length()+1;g++){
                String su =s.substring(x,g);
                Map<String, Integer> map = Arrays.asList(su.split(""))
                        .stream()
                        .collect(Collectors.groupingBy(v->v,Collectors.summingInt(v->1)));
                if (map.entrySet().size()==1){
                    deviations.add(0);
                }else {
                    int devcount = getDev(map);
                    deviations.add(devcount);
                }
            }

        }
        return deviations.stream().collect(Collectors.toList()).get(deviations.size()-1);
    }

    public static void main(String[] args){
        String se = "abcaba";
        Set<Integer> deviations = new TreeSet<>();
        int ans = getMaxFreqDeviation(se,deviations);
        System.out.println(ans);
    }
}
