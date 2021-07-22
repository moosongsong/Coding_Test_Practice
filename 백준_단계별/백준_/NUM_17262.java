import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class NUM_17262 {
    static class Fan {
        int start;
        int end;

        public Fan(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Fan{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int waitingTime = 0;
        int n = Integer.parseInt(bufferedReader.readLine());
        Fan[] fans = new Fan[n];
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            fans[i] = new Fan(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        }
        Arrays.sort(fans, new Comparator<Fan>() {
            @Override
            public int compare(Fan o1, Fan o2) {
                if (o1.start > o2.start) {
                    return 1;
                } else if (o1.start < o2.start) {
                    return -1;
                } else {
                    int max = Math.max(o1.end, o2.end);
                    o1.end = max;
                    o2.end = max;
                    return 0;
                }
            }
        });

        for (int i = 1; i < n; i++) {
            if (fans[i - 1].end < fans[i].start) {
                waitingTime += fans[i].start - fans[i - 1].end;
            }
        }

        bufferedWriter.write(String.valueOf(waitingTime));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
