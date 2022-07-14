package boj;

import java.io.*;
import java.util.*;

public class 일곱난쟁이_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] N = new int[9];
        int add = 0;
        int i = 0;
        int j = 0;

        for(i = 0; i < 9; i++) {
            N[i] = Integer.parseInt(br.readLine()); // 1. 배열 N값을 받음
        }
        
        // 2. 배열 오름차순 정렬
        Arrays.sort(N);
        
        // 3. 배열 내에서 더하기
        for(i = 0; i < 9; i++) {
            add += N[i];
        }
        
        int total = add;
        // 4. 다 더한 값에서 배열 중 값 두개 빼기
        loop:   // 이중루프문 탈출 지점
        for(i = 0; i < 8; i++) {    // 7 8 10 13 15 19 20 23 25 // 23까지만 확인 하면 됨
            for(j = i + 1; j < 9; j++) {    // j = 0부터 시작할시 중복이 체크 됨
                add -= N[i];
                add -= N[j];
                if(add != 100) {
                    add = total;
                } else {
                    break loop; // 이중루프문 탈출
                }
            }
            // if(add == 100) {     // 이중루프문 탈출로 인해 필요 없음
            //     break;
            // }
        }

        for(int k = 0; k < 9; k++) {       
            if(k == i || k == j) {
                continue;
            }
            System.out.println(N[k]);
        }
    }
}
