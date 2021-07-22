package bronze_2;

import java.io.*;

public class NUM_2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        char[] seat = bufferedReader.readLine().toCharArray();
        int capHolder = 1;
        for (int i = 0; i < seat.length; i++) {
            capHolder++;
            if (seat[i] == 'L') {
                i++;
            }
        }
        if (capHolder<seat.length){
            bufferedWriter.write(capHolder+"");
        }else{
            bufferedWriter.write(seat.length+"");
        }
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
