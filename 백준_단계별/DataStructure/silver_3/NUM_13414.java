package silver_3;

import java.io.*;
import java.util.*;

public class NUM_13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int l = Integer.parseInt(stringTokenizer.nextToken());
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < l; i++) {
            String temp = bufferedReader.readLine();
            if (set.contains(temp))
                set.remove(temp);
            set.add(temp);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            bufferedWriter.write(iterator.next() + "\n");
            if (--k <= 0) {
                break;
            }
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
