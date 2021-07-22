package datastructure;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class NUM_7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {
            TreeMap<Integer, Integer> queue = new TreeMap<>();
            int k = Integer.parseInt(bufferedReader.readLine());
            StringTokenizer stringTokenizer;
            for (int j = 0; j < k; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                String instruction = stringTokenizer.nextToken();
                int temp = Integer.parseInt(stringTokenizer.nextToken());

                if (instruction.equals("I")) {
                    queue.put(temp, queue.getOrDefault(temp, 0) + 1);
                } else if (instruction.equals("D") && !queue.isEmpty()) {
                    int key;
                    if (temp == 1) { // max
                        key = queue.lastKey();
                    } else {
                        key = queue.firstKey();
                    }
                    if (queue.get(key) > 1) {
                        queue.replace(key, queue.get(key) - 1);
                    } else {
                        queue.remove(key);
                    }
                }
            }
            if (queue.isEmpty()) {
                bufferedWriter.write("EMPTY\n");
            } else {
                bufferedWriter.write(queue.lastKey() + " " + queue.firstKey() + "\n");
            }
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();

    }
}
