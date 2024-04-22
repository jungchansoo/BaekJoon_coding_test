package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String argc[]) throws IOException {
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
	}
}
