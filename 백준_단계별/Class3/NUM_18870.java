import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class NUM_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arrays = new int[num];

        for (int i = 0; i < num; i++) {
            arrays[i] = Integer.parseInt(stringTokenizer.nextToken());
            set.add(arrays[i]);
        }

        int count = 0;
        for (int temp : set) {
            map.put(temp, count++);
        }

        for (int array : arrays) {
            bufferedWriter.write(String.valueOf(map.get(array)));
            bufferedWriter.write(' ');
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
