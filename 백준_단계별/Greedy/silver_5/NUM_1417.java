package silver_5;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class NUM_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> candidates = new PriorityQueue<>((o1, o2) -> -Integer.compare(o1, o2));
        int firstCandidate = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n - 1; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            if (firstCandidate <= temp) {
                candidates.add(temp);
            }
        }
        int count = 0;
        while (!candidates.isEmpty()) {
            int temp = candidates.poll();
            if (temp >= firstCandidate) {
                temp--;
                firstCandidate++;
                count++;
                if (temp >= firstCandidate) {
                    candidates.add(temp);
                }
            }
        }
        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}