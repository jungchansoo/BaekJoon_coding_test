package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_2581 {
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0, min=n;
        boolean check;
        
        for(int i=m; i<=n; i++) {
        	check = false;
        	if(i==1) continue;
        	
        	for(int j=2; j<i; j++) {
        		if(i % j == 0) {
        			check = true;
        			break;
        		}
        	}
        	if(!check) {
        		sum += i;
        		if(min > i)
        			min = i;
        	}
        	
        }
        if(sum != 0) 
        	System.out.println(sum + "\n" + min);
        else
        	System.out.println(-1);
        
    }
}
