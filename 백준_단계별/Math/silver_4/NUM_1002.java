package silver_4;

import java.io.*;
import java.util.StringTokenizer;

public class NUM_1002 {
    public static void main(String[] args) throws IOException {
        // 입출력 스트림 생성
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // test case의 갯수 받기
        int testCase = Integer.parseInt(bufferedReader.readLine());

        // test case 개수만큼 loop
        for (int i = 0; i < testCase; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            // circle 이라는 class를 추가로 만들어서 두개의 원 객체 생성
            Circle first = new Circle(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
            Circle second = new Circle(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));

            // 두 원의 중심 사이의 거리 구하기
            double distance = Math.sqrt(Math.pow((first.x - second.x), 2) + Math.pow((first.y - second.y), 2));

            if (distance == 0 && (first.r == second.r)) { // 두 원이 일치하는 경우 무한대이므로 -1
                bufferedWriter.write("-1\n");
            } else if (distance == 0 && (first.r != second.r)) { // 중심이 같지만, 반지름이 다른 경우, 접하지 않는다.
                bufferedWriter.write("0\n");
            } else if (distance < Math.abs(first.r - second.r)) { // 한원이 다른 원의 내부에 있어서, 서로 닿지 않는 경우
                bufferedWriter.write("0\n");
            } else if (distance == Math.abs(first.r - second.r)) { // 한원이 다른 원의 내부에 있어서, 접하는 경우
                bufferedWriter.write("1\n");
            } else if (distance < (first.r + second.r)) { // 반지름의 합보다 거리가 가까운 경우, 2점이 겹친다.
                bufferedWriter.write("2\n");
            } else if (distance == (first.r + second.r)) { // 외접하는 경우
                bufferedWriter.write("1\n");
            } else { // 나머지(반지름의 합보다 중심사이의 거리가 멀어서 접하지 않음) 는 모두 접하지 않음
                bufferedWriter.write("0\n");
            }
        }

        // 출력하고 스트림 닫기
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}

//Circle 클래스 만들기
class Circle {
    int x;
    int y;
    int r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}