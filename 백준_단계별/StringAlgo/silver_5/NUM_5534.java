package silver_5;

import java.io.*;

public class NUM_5534 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        String target = bufferedReader.readLine();
        int count = 0;
        for (int i = 0; i < n; i++)
            if (check(bufferedReader.readLine(), target))
                count += 1;
        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }

    static boolean check(String source, String target) {
        for (int index = 0; index < source.length(); index++)
            if (source.charAt(index) == target.charAt(0))
                if (isValid(index, source, target))
                    return true;
        return false;
    }

    static boolean isValid(int index, String source, String target) {
        int maxSpace = (source.length() - index - 1) / (target.length() - 1);
        for (int i = 0; i <= maxSpace; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < target.length(); j++)
                stringBuilder.append(source.charAt(index + i * j));
            if (stringBuilder.toString().equals(target))
                return true;
        }
        return false;
    }
}
