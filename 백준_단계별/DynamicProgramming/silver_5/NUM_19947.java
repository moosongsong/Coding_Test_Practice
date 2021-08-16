package silver_5;

import java.io.*;
import java.util.StringTokenizer;

public class NUM_19947 {
    public static void main(String[] args) throws IOException {
        // 입출력 버퍼
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        // 돈, 투자 기간
        int money = Integer.parseInt(stringTokenizer.nextToken());
        int year = Integer.parseInt(stringTokenizer.nextToken());

        long[] dp = new long[year + 1];
        dp[0] = money;

        for (int i = 1; i <= year; i++) {
            // 우선 1년을 투자한다고 가정
            dp[i] = (long) (dp[i - 1] * 1.05);
            if (i >= 3) { // 3년 이상이면 3년을 투자한 값과 현재의 값을 비교하여 큰 것으로 교체
                dp[i] = (long) Math.max(dp[i - 3] * 1.2, dp[i]);
            }
            if (i >= 5) { // 5년 이상이면 5년을 투자한 값과 현재의 값을 비교하여 큰 것으로 교체
                dp[i] = (long) Math.max(dp[i - 5] * 1.35, dp[i]);
            }
        }
        bufferedWriter.write(String.valueOf(dp[year]));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
