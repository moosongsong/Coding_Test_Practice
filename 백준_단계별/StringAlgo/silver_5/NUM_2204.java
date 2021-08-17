package silver_5;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class NUM_2204 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int count = Integer.parseInt(bufferedReader.readLine());
            if (count == 0) {
                break;
            }
            TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.toLowerCase().compareTo(o2.toLowerCase());
                }
            });
            for (int i = 0; i < count; i++) {
                set.add(bufferedReader.readLine());
            }
            bufferedWriter.write(set.first());
            bufferedWriter.write('\n');
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
