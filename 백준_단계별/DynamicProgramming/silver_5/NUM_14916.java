package silver_5;

import java.io.*;

public class NUM_14916 {
    public static void main(String[] args) throws IOException {
        // 입출력 버퍼 생성
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        // 거스름돈
        int remain = Integer.parseInt(bufferedReader.readLine());
        // 동전 개수
        int numOfCoins = 0;

        while (true) {
            if (remain % 5 == 0) { // 5로 나누어지는지 확인하고 반복문 통과
                numOfCoins += remain / 5;
                break;
            } else if (remain < 0) { // 만약 나머지가 0보다 작으면 거스름돈을 나눌 수 없음.
                numOfCoins = -1; // 출력 값을 -1로 지정
                break;
            } else if (remain == 0) { // 나누어 떨어지면 통과
                break;
            }
            // 2만큼빼고 동전 개수 더하기
            remain -= 2;
            numOfCoins += 1;
        }
        // 버퍼에 출력값 입력
        bufferedWriter.write(String.valueOf(numOfCoins));
        // 버퍼값 출력하기
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
