package silver_5;

import java.io.*;

public class NUM_15904 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] origin = new char[]{'U', 'C', 'P', 'C'};
        StringBuilder stringBuilder = new StringBuilder(bufferedReader.readLine());
        int len = stringBuilder.length();
        int index = 0;
        for (int i = 0; i < len; i++) {
            char temp = stringBuilder.charAt(index);
            if ((temp >= 'a' && temp <= 'z') || (temp == ' ')) {
                stringBuilder.deleteCharAt(index);
            } else {
                index++;
            }
        }
        index = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (index == 4) {
                break;
            }
            if (stringBuilder.charAt(i) == origin[index]) {
                index++;
            }
        }
        if (index == 4) {
            bufferedWriter.write("I love UCPC");
        } else {
            bufferedWriter.write("I hate UCPC");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
