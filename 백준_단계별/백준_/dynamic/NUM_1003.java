package dynamic;

import java.io.*;

public class NUM_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        int[] tests = new int[testCase];
        int max = 0;
        for (int i = 0; i < testCase; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            tests[i] = temp;
            max = Math.max(temp, max);
        }
        int[] dpForZero = new int[max + 1];
        int[] dpForOne = new int[max + 1];
        dpForZero[0] = 1;
        dpForZero[1] = 0;
        dpForOne[0] = 0;
        dpForOne[1] = 1;
        for (int i = 2; i < dpForOne.length; i++) {
            dpForOne[i] = dpForOne[i - 1] + dpForOne[i - 2];
            dpForZero[i] = dpForZero[i - 1] + dpForZero[i - 2];
        }
        for (int i = 0; i < testCase; i++) {
            bufferedWriter.write(dpForZero[tests[i]] + " " + dpForOne[tests[i]] + "\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
