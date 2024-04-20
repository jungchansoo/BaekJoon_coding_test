package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_18868 {
	static int[][] arr;
	 static int M, N, count = 0;

	 public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       M = Integer.parseInt(st.nextToken());
       N = Integer.parseInt(st.nextToken());
       arr = new int[M][N];
       
       for (int i = 0; i < M; i++) {
       	st = new StringTokenizer(br.readLine());
       	 for (int j = 0; j < N; j++) {
	            arr[i][j] = Integer.parseInt(st.nextToken());
	        }
       }
       
       for(int i=0; i<M-1; i++) {
       	for(int j=i+1; j<M; j++) {
       		if(compare(arr[i],arr[j])) {
       			count++;
       		}
       	}
       }
       
       System.out.println(count);
       
	 }
   
	 private static boolean compare(int[] first, int[] second) {
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if((first[i]> first[j]) != (second[i]>second[j])){
					return false;
				}
				else if((first[i]==first[j]) != (second[i]==second[j])){
					return false;
				}
				else if((first[i]<first[j]) != (second[i]<second[j])){
					return false;
				}
			}
		}
		
		return  true;
	 }

}
