package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	 static int[] arr;
	    static int N, S, count = 0;

	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        // 입력 받기
	        String[] input = br.readLine().split(" ");
	        N = Integer.parseInt(input[0]);
	        S = Integer.parseInt(input[1]);
	        
	        arr = new int[N];
	        input = br.readLine().split(" ");
	        for (int i = 0; i < N; i++) {
	            arr[i] = Integer.parseInt(input[i]);
	        }

	        // 부분수열 생성
	        DFS(0, 0);
	        
	        if(S == 0) {
	        	count--;
	        }
	        // S와 같은 합을 가지는 부분수열의 개수 출력
	        System.out.println(count);
	    }

	    // 부분수열 생성
	    static void DFS(int index, int sum) {
	        if (index == N) {
	            if (sum == S) {
	                count++;
	            }
	            return;
	        }
	        
	        DFS(index + 1, sum + arr[index]); // 현재 원소를 선택하는 경우
	        DFS(index + 1, sum); // 현재 원소를 선택하지 않는 경우
	    }
}
