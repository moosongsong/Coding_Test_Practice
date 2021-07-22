package silver_5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUM_16471 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] me = new int[n];
        int[] you = new int[n];
        int myScore = 0;
        int yourIndex = 0;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            me[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            you[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(me);
        Arrays.sort(you);

        for (int i = 0; i < n; i++) {
            for (int j = yourIndex; j < n; j++) {
                if (me[i] < you[j]) {
                    yourIndex = j + 1;
                    myScore++;
                    break;
                }
            }
            if (myScore == (n + 1) / 2){
                break;
            }
        }
        if (myScore >= (n + 1) / 2) {
            bufferedWriter.write("YES");
        } else {
            bufferedWriter.write("NO");
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
