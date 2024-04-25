package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_15993 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        int max = 0;
        int[] cases = new int[T];

        for (int i = 0; i < T; i++) {
            cases[i] = Integer.parseInt(br.readLine());
            if (cases[i] > max) {
                max = cases[i];
            }
        }

        // 동적 프로그래밍 테이블
        long[][] dp = new long[max + 1][2]; // dp[i][0]: 짝수 개수 사용, dp[i][1]: 홀수 개수 사용
        if(max >= 1) {
        	dp[1][1] = 1; 
        }
        if(max >= 2) {
        	dp[2][0] = 1;  
            dp[2][1] = 1;
        }
        if(max >= 3) {
        	dp[3][0] = 2;  
            dp[3][1] = 2; 
        }
        
        // 점화식 계산
        for (int i = 4; i <= max; i++) {
            dp[i][0] = (dp[i-1][1] + dp[i-2][1] + dp[i-3][1]) % 1000000009; // 짝수 개수에서 옮겨와 홀수를 만듦
            dp[i][1] = (dp[i-1][0] + dp[i-2][0] + dp[i-3][0]) % 1000000009; // 홀수 개수에서 옮겨와 짝수를 만듦
        }

        for(int i=0; i<T; i++) {
        	System.out.println(dp[cases[i]][1] + " " + dp[cases[i]][0]);
        }
    }
}
