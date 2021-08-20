package silver_5;

import java.io.*;
import java.util.StringTokenizer;

public class NUM_6550 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                if (isValid(stringTokenizer.nextToken(), stringTokenizer.nextToken()))
                    bufferedWriter.write("Yes\n");
                else
                    bufferedWriter.write("No\n");
            } catch (Exception e) {
                break;
            }
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }

    static boolean isValid(String sub, String top) {
        StringBuilder stringBuilder = new StringBuilder().append(top);
        for (int i = 0; i < sub.length(); i++) {
            while (true) {
                if (stringBuilder.length() == 0) return false;
                char temp = stringBuilder.charAt(0);
                stringBuilder.deleteCharAt(0);
                if (sub.charAt(i) == temp) break;
            }
        }
        return true;
    }
}
