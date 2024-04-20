package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_14912 {
	 static int n, d, count = 0;

	 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<=n; i++) {
        	int num = i;
        	while(num != 0) {
        		if(num%10 == d){
            		count++;
            	}
        		num /= 10;
        	}
        }
        
        System.out.println(count);
	 }
}