package silver_5;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUM_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            queue.add(i);
        }
        bufferedWriter.write("<");
        while (true){
            for (int i = 0; i < k-1; i++) {
                queue.add(queue.poll());
            }
            bufferedWriter.write(String.valueOf(queue.poll()));
            if (queue.isEmpty()){
                break;
            }else{
                bufferedWriter.write(", ");
            }
        }
        bufferedWriter.write(">");
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
