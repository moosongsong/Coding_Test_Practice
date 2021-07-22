package silver_3;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class NUM_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int numOfA = Integer.parseInt(stringTokenizer.nextToken());
        int numOfB = Integer.parseInt(stringTokenizer.nextToken());
        TreeSet<Integer> setA = new TreeSet<>();
        TreeSet<Integer> setB = new TreeSet<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < numOfA; i++) {
            setA.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < numOfB; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            if (setA.contains(temp)){
                setA.remove(temp);
            }else{
                setB.add(temp);
            }
        }
        bufferedWriter.write(String.valueOf(setA.size()+setB.size()));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
