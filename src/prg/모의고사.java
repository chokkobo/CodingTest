package prg;
import java.util.*;

class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] counter = new int[3];
        
        // 1. 1번 2번 3번 수포자의 배열
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        // 2. answers와 각 수포자들의 배열을 비교
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                counter[0]++;
            }
            if (answers[i] == second[i % second.length]) {
                counter[1]++;
            }
            if (answers[i] == third[i % third.length]) {
                counter[2]++;
            }
        }
        
        // 3. 각각 count된 숫자를 비교
        int max = 0;
        for (int i = 0; i < counter.length; i++) {
            if (max < counter[i]) {
                max = counter[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < counter.length; i++) {
            if (max == counter[i]) {
                list.add(i + 1);
            }
        }
        answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}