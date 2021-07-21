package greedy;

import java.io.*;
import java.util.StringTokenizer;

class Couple {
    int x;
    int y;

    public Couple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getMax() {
        return Math.max(x, y);
    }

    int getMin() {
        return Math.min(x, y);
    }

    int getTotal() {
        return x + y;
    }

    @Override
    public String toString() {
        return "Couple{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class NUM_1041_ {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int numOfDices = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] dice = new int[6];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Couple[] couples = new Couple[3];
        couples[0] = new Couple(dice[0], dice[5]);
        couples[1] = new Couple(dice[1], dice[4]);
        couples[2] = new Couple(dice[2], dice[3]);

        int minCoupleIndex = 0;
        int minCouple = Integer.MAX_VALUE;
        for (int i = 0; i < couples.length; i++) {
            if (minCouple > couples[i].getTotal()) {
                minCouple = couples[i].getTotal();
                minCoupleIndex = i;
            } else if (minCouple == couples[i].getTotal()) {
                if (couples[i].getMax() > couples[minCoupleIndex].getMax()) {
                    minCoupleIndex = i;
                }
            }
        }

        int step = 0;
        for (int i = 0; i < couples.length; i++) {
            if (i == minCoupleIndex) {
                continue;
            }
            step += couples[i].getTotal();
        }

        int result = step * numOfDices + couples[minCoupleIndex].getMax();

        System.out.println(result);
    }
}
