package gold_5;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class NUM_13975 {
    public static void main(String[] args) throws IOException {
        // 입출력 버퍼
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        // 테스트 케이스 개수
        int numOfTest = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < numOfTest; i++) {
            // 요소의 개수
            int numOfElement = Integer.parseInt(bufferedReader.readLine());
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            // 요소들을 우선순위 큐에 집어 넣는다.
            PriorityQueue<Long> queue = new PriorityQueue<>();
            for (int j = 0; j < numOfElement; j++) {
                queue.add(Long.parseLong(stringTokenizer.nextToken()));
            }
            // 값이 일반적인 정수의 범위를 넘을 수 있기 때문에 Long의 자료형으로 정의 및 선언해야한다.
            Long totalCost = (long)0;
            while (queue.size()>=2) {
                Long first = queue.poll();
                Long second = queue.poll();
                long temp = first + second;
                totalCost += temp;
                queue.add(temp);
            }
            bufferedWriter.write(String.valueOf(totalCost));
            bufferedWriter.write('\n');
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
