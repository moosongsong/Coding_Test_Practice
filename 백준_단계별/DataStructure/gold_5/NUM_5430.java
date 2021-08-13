package gold_5;

import java.io.*;
import java.util.*;

public class NUM_5430 {
    // 각각의 Testcase를 위한 클래스를 따로 작성
    static class Test {
        // 리버스 대신 앞뒤로 빼기 위한 Deque
        Deque<Integer> deque;
        // 앞인지 뒤인지 체크하기 외한 플래그
        boolean isFront;

        // 생성자에 문자열과 사이즈를 입력받아 Testcase 의 deque를 내부에서 바로 처리한다.
        Test(String array, int size) {
            deque = new ArrayDeque<>();
            StringTokenizer stringTokenizer = new StringTokenizer(array,"[],");
            for (int i = 0; i < size; i++) {
                deque.add(Integer.valueOf(stringTokenizer.nextToken()));
            }
            isFront = true;
        }

        // 뒤집기
        public void R() {
            isFront = !isFront;
        }

        // deque에 들어있는 항목 빼내기, 없는데 시도한 경우에만 error를 출력해야한다.
        public boolean D() {
            if (deque.isEmpty()) {
                return false;
            }
            if (isFront){
                deque.removeFirst();
            }else{
                deque.removeLast();
            }
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        // 입출력 스트림 만들기
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        // 테스트 케이스 개수 입력
        int testCase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testCase; i++) {
            // 명령어
            String instruction = bufferedReader.readLine();
            // 배열 요소의 개수
            int numOfElements = Integer.parseInt(bufferedReader.readLine());
            // 배열
            String array = bufferedReader.readLine();
            // 배열과 배열 요소의 개수로 테스트 케이스 만들기
            Test test = new Test(array, numOfElements);
            // 에러가 발생했는지 확인하는 플래그
            boolean isError = true;
            // 명렬어 처리하기
            for (int j = 0; j < instruction.length(); j++) {
                if (instruction.charAt(j) == 'R') {
                    test.R();
                } else {
                    isError = test.D();
                    // 에러 발생시 반복문 중단하기
                    if (!isError) {
                        break;
                    }
                }
            }
            // 에러 여부에 따른 출력 방식의 차이
            if (!isError) {
                bufferedWriter.write("error\n");
            } else {
                bufferedWriter.write("[");
                while (!test.deque.isEmpty()){
                    if (test.isFront){
                        bufferedWriter.write(String.valueOf(test.deque.removeFirst()));
                    }else{
                        bufferedWriter.write(String.valueOf(test.deque.removeLast()));
                    }
                    if (!test.deque.isEmpty()) {
                        bufferedWriter.write(',');
                    }
                }
                bufferedWriter.write("]\n");
            }
        }
        // 출력 및 입출력 해제
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
