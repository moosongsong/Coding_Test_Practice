package silver_4;

import java.io.*;
import java.util.StringTokenizer;

public class NUM_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testCase; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            Circle first = new Circle(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
            Circle second = new Circle(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
            double distance = Math.sqrt(Math.pow((first.x - second.x), 2) + Math.pow((first.y - second.y), 2));
            if (distance == 0 && (first.r == second.r)) {
                bufferedWriter.write("-1\n");
            } else if (distance == 0 && (first.r != second.r)) {
                bufferedWriter.write("0\n");
            } else if (distance < Math.abs(first.r - second.r)) {
                bufferedWriter.write("0\n");
            } else if (distance == Math.abs(first.r - second.r)) {
                bufferedWriter.write("1\n");
            } else if (distance < (first.r + second.r)) {
                bufferedWriter.write("2\n");
            } else if (distance == (first.r + second.r)) {
                bufferedWriter.write("1\n");
            } else {
                bufferedWriter.write("0\n");
            }
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}

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