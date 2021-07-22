package silver_5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUM_11256 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testCase; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int numOfCandy = Integer.parseInt(stringTokenizer.nextToken());
            int numOfBox = Integer.parseInt(stringTokenizer.nextToken());
            int[] boxes = new int[numOfBox];
            for (int j = 0; j < numOfBox; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                boxes[j] = Integer.parseInt(stringTokenizer.nextToken()) * Integer.parseInt(stringTokenizer.nextToken());
            }
            Arrays.sort(boxes);
            int count = 1;
            int total = boxes[boxes.length - 1];
            for (int j = boxes.length - 2; j >= 0; j--) {
                if (total >= numOfCandy) {
                    break;
                }
                total += boxes[j];
                count++;
            }
            bufferedWriter.write(count + "\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
