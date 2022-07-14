package prg;
import java.util.*;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] sort;
        for (int i = 0; i < commands.length; i++) {
            sort = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);  
            Arrays.sort(sort);
            answer[i] = sort[commands[i][2] - 1];
        }
        
        return answer;
    }
}