package silver_5;

import java.io.*;
import java.util.StringTokenizer;

public class NUM_12782 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int testCase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testCase; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            StringBuilder first = new StringBuilder(stringTokenizer.nextToken());
            StringBuilder second = new StringBuilder(stringTokenizer.nextToken());
            int len = first.length();
            int index = 0;
            for (int j = 0; j < len; j++) {
                if (first.charAt(index) == second.charAt(index)) {
                    first.deleteCharAt(index);
                    second.deleteCharAt(index);
                } else {
                    index++;
                }
            }
            int count = 0;
            for (int j = 0; j < first.length(); j++) {
                if (first.charAt(j) == '0') {
                    count++;
                }
            }
            count = Math.max(count, first.length() - count);
            bufferedWriter.write(count + "\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
