package bronze_2;

import java.io.*;

public class NUM_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] dp = new int[21];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        bufferedWriter.write(String.valueOf(dp[n]));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
