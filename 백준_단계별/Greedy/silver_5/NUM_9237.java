package silver_5;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class NUM_9237 {
    static Integer[] trees;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        trees = new Integer[n];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(trees, Collections.reverseOrder());

        int max = 0;
        for (int i = 0; i < trees.length; i++) {
            trees[i] += i + 1;
            max = Math.max(max, trees[i]);
        }
        bufferedWriter.write(String.valueOf(max + 1));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
