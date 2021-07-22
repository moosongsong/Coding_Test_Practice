package silver_5;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class NUM_14469 {
    static class COW {
        int start;
        int time;
        int end;

        public COW(int start, int time) {
            this.start = start;
            this.time = time;
            this.end = start + time;
        }

        @Override
        public String toString() {
            return "COW{" +
                    "start=" + start +
                    ", time=" + time +
                    ", end=" + end +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int numOfCow = Integer.parseInt(bufferedReader.readLine());
        LinkedList<COW> cows = new LinkedList<>();
        for (int i = 0; i < numOfCow; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            cows.add(new COW(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())));
        }
        Collections.sort(cows, new Comparator<COW>() {
            @Override
            public int compare(COW o1, COW o2) {
                if (o1.start > o2.start) {
                    return 1;
                } else if (o1.start < o2.start) {
                    return -1;
                } else {
                    return Integer.compare(o1.end, o2.end);
                }
            }
        });
        for (int i = 1; i < cows.size(); i++) {
            int one = cows.get(i - 1).end;
            int second = cows.get(i).start;
            if (one > second) {
                int gap = one - second;
                cows.get(i).start += gap;
                cows.get(i).end += gap;
            }
        }
        bufferedWriter.write(String.valueOf(cows.getLast().end));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
