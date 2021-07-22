package silver_5;

import java.io.*;
import java.util.StringTokenizer;

public class NUM_4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int index = 1;
        while (true) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int L = Integer.parseInt(stringTokenizer.nextToken());
            if (L == 0) {
                break;
            }
            int P = Integer.parseInt(stringTokenizer.nextToken());
            int V = Integer.parseInt(stringTokenizer.nextToken());

            int remain = V % P;
            int result = (V / P) * L;
            result += Math.min(remain, L);

            bufferedWriter.write("Case " + index++ + ": " + result + "\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
