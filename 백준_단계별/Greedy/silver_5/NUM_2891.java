package silver_5;

import java.io.*;
import java.util.StringTokenizer;

public class NUM_2891 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken()); // 팀수
        int S = Integer.parseInt(stringTokenizer.nextToken()); // 카약이 손상된 팀의 수
        int R = Integer.parseInt(stringTokenizer.nextToken()); // 카약 더가저온 팀의 수
        int[] teams = new int[N + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < S; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            teams[num] -= 1;
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < R; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            teams[num] += 1;
        }
        if (teams[0] == -1) {
            if (teams[1] == 1) {
                teams[0] += 1;
                teams[1] -= 1;
            }
        }
        for (int i = 1; i < teams.length; i++) {
            if (teams[i] == -1) {
                if (teams[i - 1] == 1) {
                    teams[i] += 1;
                    teams[i - 1] -= 1;
                } else if (i + 1 < teams.length && teams[i + 1] == 1) {
                    teams[i] += 1;
                    teams[i + 1] -= 1;
                }
            }
        }
        int count = 0;
        for (int team : teams) {
            if (team == -1) {
                count++;
            }
        }
        bufferedWriter.write(String.valueOf(count));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
