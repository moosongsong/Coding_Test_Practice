import java.io.*;

public class NUM_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bufferedReader.readLine());
        int[] times = new int[]{30, 6};
        if (t % 10 != 0) {
            bufferedWriter.write("-1");
            bufferedWriter.flush();
            return;
        }

        t = t / 10;
        for (int i = 0; i < 2; i++) {
            bufferedWriter.write(t / times[i] + " ");
            t = t % times[i];
        }
        bufferedWriter.write(String.valueOf(t));

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
