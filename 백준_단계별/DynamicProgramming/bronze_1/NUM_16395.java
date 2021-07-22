package bronze_1;

import java.io.*;
import java.util.StringTokenizer;

public class NUM_16395 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int[][] dp = new int[31][31];
        for (int i = 1; i < dp.length; i++) {
            dp[i][1] = dp[i][i] = 1;
        }
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                if (i==n && j==k){
                    break;
                }
            }
        }
        bufferedWriter.write(String.valueOf(dp[n][k]));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
