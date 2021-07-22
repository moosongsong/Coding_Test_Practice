package dynamic;

import java.io.*;

public class NUM_11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] dp1 = new int[1001];
        dp1[0] = 0;
        dp1[1] = 1;
        dp1[2] = 3;
        for (int i = 3; i < n + 1; i++) {
            dp1[i] = (dp1[i - 1] + dp1[i - 2] * 2) % 10007;
        }
        bufferedWriter.write(String.valueOf(dp1[n]));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
