import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class NUM_16206_ {
    static final int CUT = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        int count = 0;
        int cutCount = 0;
        while (true) {
            if (cutCount >= m || queue.isEmpty()) {
                break;
            }
            int item = queue.poll();
            if (item < 10) {
                break;
            }


            System.out.println(item + ", " + cutCount + ", " + count);
        }

        System.out.println(count);
    }
}
