package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_20365 {
	 static int n,b=0,r=0;
	 static char color, pre;
	 static String problem;
	 
	 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        problem = br.readLine();
        
        for(int i=0; i<n; i++) {
        	color = problem.charAt(i);
        	if(color == 'B' && pre != 'B') {
        		b++;
        	}else if(color == 'R' && pre != 'R'){
        		r++;
        	}
        	pre = color;
        }
        
        if(b >= r) {
        	System.out.println(1+r);
        }else {
        	System.out.println(1+b);
        }
        
	 }
}
