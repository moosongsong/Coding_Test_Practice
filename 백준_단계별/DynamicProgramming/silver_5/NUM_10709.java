package silver_5;

import java.io.*;
import java.util.StringTokenizer;

public class NUM_10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int h = Integer.parseInt(stringTokenizer.nextToken());
        int w = Integer.parseInt(stringTokenizer.nextToken());
        for (int i = 0; i < h; i++) {
            int cnt = 0;
            String temp = bufferedReader.readLine();
            for (int j = 0; j < w; j++) {
                if (temp.charAt(j) == '.' && cnt == 0) {
                    bufferedWriter.write(-1 + " ");
                } else if (temp.charAt(j) == 'c') {
                    bufferedWriter.write(0 + " ");
                    cnt = 1;
                } else if (temp.charAt(j) == '.' && cnt != 0) {
                    bufferedWriter.write(cnt + " ");
                    cnt++;
                }
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
