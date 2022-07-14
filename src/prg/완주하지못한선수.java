package prg;
import java.util.HashMap;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 1. HashMap을 만들어 participant를 담는다.
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        // 2. HsahMap에서 completion을 뺀다.
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        // 3. 0이 아닌 value를 answer에 담는다.
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
