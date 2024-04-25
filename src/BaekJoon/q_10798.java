package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[][] input = new char[5][15];
        
        for(int i=0; i<5; i++) {
        	String line = br.readLine();
        	for(int j=0; j<line.length(); j++) {
        		input[i][j] = line.charAt(j);
        	}
        }
        
        for (int i = 0; i < 15; i++) { // 열 우선 순회
            for (int j = 0; j < 5; j++) { // 행 순회
                if (input[j][i] != '\u0000') { // 널 문자가 아닌 경우만 출력
                    System.out.print(input[j][i]);
                }
            }
        }
    }
}
