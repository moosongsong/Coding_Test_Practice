package bronze_1;

import java.io.*;

public class NUM_13301 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        long[] dp = new long[81];
        dp[0] = 0;
        dp[1] = 4;
        dp[2] = 6;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        bufferedWriter.write(String.valueOf(dp[n]));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
