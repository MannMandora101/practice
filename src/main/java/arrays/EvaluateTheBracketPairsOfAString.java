package arrays;
/*
  @created 15/11/22
  @author  manish.mandora
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvaluateTheBracketPairsOfAString {
    public String evaluate(String s, List<List<String>> knowledge) {
        int idx = 0;
        HashMap<String, String> kmap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (List<String> strings : knowledge) {
            kmap.put(strings.get(0), strings.get(1));
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                result.append(s.substring(idx, i));
                idx=i+1;
            } else if (s.charAt(i) == ')') {
                result.append(kmap.get(s.substring(idx, i)));
                idx=i+1;
            }
        }
        result.append(s.substring(idx));
        return result.toString();
    }


    public String evaluate_(String s, List<List<String>> knowledge)
    {
        int index=0;
        StringBuilder result= new StringBuilder();
        HashMap<String,String> map= new HashMap<>();

        for(List<String> list: knowledge)
            map.put(list.get(0), list.get(1));
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i)=='(')
            {
                result.append(s.substring(index, i));
                index=i+1;
            }
            else if (s.charAt(i)==')')
            {
                result.append(map.getOrDefault(s.substring(index, i), "?"));
                index=i+1;
            }
        }
        result.append(s.substring(index));
        return result.toString();
    }
    public static void main(String[] args) {
        EvaluateTheBracketPairsOfAString pairs = new EvaluateTheBracketPairsOfAString();
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("name");
        list.add("bob");
        list1.add("age");
        list1.add("two");
        result.add(list);
        result.add(list1);
        String s="(name)is(age)yearsold";
        System.out.println(s + " : " + s.substring(0,0));
        System.out.println(pairs.evaluate("(name)is(age)yearsold",result));

    }
}
