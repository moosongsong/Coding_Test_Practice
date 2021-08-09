package silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUM_1463 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        dp = new Integer[x + 1];
        dp[0] = dp[1] = 0;
        System.out.println(recursive(x));
    }

    static int recursive(int x) {
        if (dp[x] == null) {
            if (x % 6 == 0) {
                dp[x] = Math.min(recursive(x - 1), Math.min(recursive(x / 3), recursive(x / 2))) + 1;
            } else if (x % 3 == 0) {
                dp[x] = Math.min(recursive(x / 3), recursive(x - 1)) + 1;
            } else if (x % 2 == 0) {
                dp[x] = Math.min(recursive(x / 2), recursive(x - 1)) + 1;
            } else {
                dp[x] = recursive(x - 1) + 1;
            }
        }
        return dp[x];
    }
}
