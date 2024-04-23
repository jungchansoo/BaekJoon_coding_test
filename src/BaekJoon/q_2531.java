package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class q_2531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 회전 접시의 수
        int d = Integer.parseInt(st.nextToken()); // 초밥의 가짓수
        int k = Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(st.nextToken()); // 쿠폰 번호

        int[] sushi = new int[n];
        for (int i = 0; i < n; i++) {
            sushi[i] = Integer.parseInt(br.readLine()); // 초밥 번호 입력
        }

        int[] select = new int[d + 1]; // 각 초밥 번호가 몇번 골라졌는지 저장
        int sushitype = 0; // 고른 초밥종류의 수
        int maxtypes = 0; // 최대 초밥 종류 수

        // 초기 초밥담기
        for (int i = 0; i < k; i++) {
            if (select[sushi[i]] == 0) {
            	sushitype++;
            }
            select[sushi[i]]++;
        }

        maxtypes = sushitype;
        if (select[c] == 0) maxtypes++;

        // 슬라이딩 윈도우
        for (int i = 1; i < n; i++) {
            int prev = sushi[i - 1]; // 담은 초밥중 처음담은 초밥
            int next = sushi[(i + k - 1) % n]; // prev가 제거되고 다음에 담을 초밥

            select[prev]--;
            
            if (select[prev] == 0) sushitype--;

            if (select[next] == 0) sushitype++;
            
            select[next]++;
            
            int currenttype = sushitype; //sushitype은 현재 담은 것만 쿠폰은 포함 ㄴㄴ
            if (select[c] == 0) currenttype++; //따라서 쿠폰으로 담은건 select x

            if (maxtypes < currenttype)
            	maxtypes = currenttype;
        }

        System.out.println(maxtypes); // 최대 초밥 종류 수 출력
    }
}