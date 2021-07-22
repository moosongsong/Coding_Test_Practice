package silver_5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUM_16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int l = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] apple = new int[n];
        for (int i = 0; i < n; i++) {
            apple[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(apple);
        for (int j : apple) {
            if (j > l) {
                break;
            } else {
                l += 1;
            }
        }
        bufferedWriter.write(String.valueOf(l));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
