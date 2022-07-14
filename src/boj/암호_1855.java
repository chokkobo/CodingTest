package boj;

import java.io.*;

public class 암호_1855 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine()); // 1. K값을 받음
        String S = br.readLine();   // 2. S값을 받음

        // 3. 배열 생성 [row][col]
        char[][] c = new char[S.length()/K][K];
        // 3. 2중 for 첫번째 for (row) 두번째 (col) str[i][j] s의 인덱스값을 추출
        for(int i = 0; i < S.length()/K; i++) {
            for(int j = 0; j < K; j++) {
                if(i % 2 == 0) {
                    int index = i * K + j;
                    c[i][j] = S.charAt(index);
                } else {
                    int index = K * i + K - 1 - j;
                    c[i][j] = S.charAt(index);
                }
            }
        }
        // 4. 2중 for 첫번째 for (col) 두번째 (row)
        for(int j = 0; j < K; j++)
        {
            for(int i = 0; i < S.length()/K; i++)
            {
                // 4. 값을 출력
                System.out.print(c[i][j]);
            }
        }
    }
}
