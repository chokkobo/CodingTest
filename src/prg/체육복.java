package prg;
public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 1. 전체 학생 수 + 2의 배열을 만듬
        int[] total = new int[n + 2];
        
        // 2. reserve가 있다면 +1 lost가 있다면 -1;
        for (int i : reserve) {
            total[i]++;
        }
        for (int i : lost) {
            total[i]--;
        }

        // 3. 여분의 체육복이 있다면 앞 또는 뒤에게 빌려줌
        for (int i = 1; i <= n; i++) {
            if (total[i] == 1) {
                if (total[i -1] == -1) {
                    total[i]--;
                    total[i - 1]++;
                } else if (total[i + 1] == -1) {
                    total[i]--;
                    total[i + 1]++;
                }
            }
        }
        
        // 4. 0이상의 값을 answer에 증가
        for (int i = 1; i <= n; i++) {
            if (total[i] >= 0) {
                answer++;
            }
        }
            
        return answer;
    }
}