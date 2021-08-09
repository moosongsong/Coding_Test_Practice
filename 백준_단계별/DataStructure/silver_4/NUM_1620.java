package silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NUM_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        Dictionary<Integer, String> dictForInt = new Hashtable<>();
        Dictionary<String, Integer> dictForStr = new Hashtable<>();

        for (int i = 1; i <= n; i++) {
            String temp = bufferedReader.readLine();
            dictForInt.put(i, temp);
            dictForStr.put(temp, i);
        }

        for (int i = 0; i < m; i++) {
            String temp = bufferedReader.readLine();
            try {
                int key = Integer.parseInt(temp);
                stringBuilder.append(dictForInt.get(key)).append('\n');
            } catch (NumberFormatException e) {
                stringBuilder.append(dictForStr.get(temp)).append('\n');
            }
        }

        System.out.println(stringBuilder);
    }
}
