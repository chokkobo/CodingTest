package prg;
import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;

        // HashSet은 중복을 제거 하여 담는다.
        // 1.HashSet을 만들어 nums을 담는다.
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        // 2.총 마리 수 중에 N/2만큼 뽑는다.
        if (set.size() < nums.length / 2) {
            answer = set.size();
        } else {
            answer = nums.length / 2;
        }

        return answer;
    }
}