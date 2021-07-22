package silver_5;

import java.io.*;

public class NUM_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bufferedReader.readLine());
        int index = 0;
        while (n >= 0) {
            n -= ++index;
        }
        bufferedWriter.write(String.valueOf(index-1));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
