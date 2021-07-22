package bronze_2;

import java.io.*;

public class NUM_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] remains = new int[]{500, 100, 50, 10, 5, 1};
        int money = 1000 - Integer.parseInt(bufferedReader.readLine());

        int count = 0;
        for (int remain : remains) {
            count += money / remain;
            money %= remain;
        }
        bufferedWriter.write(String.valueOf(count));

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
