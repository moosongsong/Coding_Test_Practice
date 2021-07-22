package bronze_1;

import java.io.*;

public class NUM_9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] dpA = new int[46];
        int[] dpB = new int[46];
        dpA[0] = dpB[0] = dpA[1] = 0;
        dpA[2] = dpB[1] = dpB[2] = 1;

        for (int i = 3; i <= n; i++) {
            dpA[i] = dpA[i - 1] + dpA[i - 2];
            dpB[i] = dpB[i - 1] + dpB[i - 2];
        }
        bufferedWriter.write(dpA[n] + " " + dpB[n]);
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
