package silver_5;

import java.io.*;

public class NUM_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] chars = bufferedReader.readLine().toCharArray();
        int numOfZero = 0;
        int numOfOne = 0;
        if (chars[0] == '0') {
            numOfZero++;
        } else {
            numOfOne++;
        }
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                if (chars[i] == '0') {
                    numOfZero++;
                } else {
                    numOfOne++;
                }
            }
        }
        bufferedWriter.write(String.valueOf(Math.min(numOfOne, numOfZero)));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
