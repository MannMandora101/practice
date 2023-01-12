package HashMap;/* 
  @created 08/12/22
  @author  manish.mandora
*/

import java.util.HashMap;

public class FindItenerary {
    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStatingPoint(tickets);
        while (tickets.containsKey(start)) {
            System.out.print(start + "-->");
            start = tickets.get(start);
        }

        System.out.println(start);
    }

    private static String getStatingPoint(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }
        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }


}
