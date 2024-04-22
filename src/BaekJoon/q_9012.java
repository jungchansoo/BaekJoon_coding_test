package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_9012 {

	public static void main(String[] args) throws IOException {
		// 하나입력 - 하나출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String ps;
		int opencount;
		
		for(int i=0; i<t; i++) {
			ps = br.readLine();
			opencount =0;
			for(int j=0; j<ps.length(); j++) {
				if(ps.charAt(j) == '(')
					opencount++;
				else
					opencount--;
				
				
				if(opencount < 0) 
					break;
				
			}
			if(opencount != 0) 
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		
		/* 전부입력 - 결과를 하나씩 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] ps = new String[t];
		int opencount;
		
		for(int i=0; i<t; i++) {
			ps[i] = br.readLine();
		}
		
		for(int i=0; i<t; i++) {
			opencount =0;
			for(int j=0; j<ps[i].length(); j++) {
				if(ps[i].charAt(j) == '(')
					opencount++;
				else
					opencount--;
				
				
				if(opencount < 0) 
					break;
				
			}
			if(opencount != 0) 
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		*/
	}

}
