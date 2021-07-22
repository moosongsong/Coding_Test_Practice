package silver_2;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class NUM_19583 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        String conferenceStart = stringTokenizer.nextToken();
        String conferenceEnd = stringTokenizer.nextToken();
        String streamingEnd = stringTokenizer.nextToken();

        TreeSet<String> startCheck = new TreeSet<>();
        TreeSet<String> endCheck = new TreeSet<>();
        TreeSet<String> names = new TreeSet<>();

        String str;
        while ((str = bufferedReader.readLine()) != null) {
            stringTokenizer = new StringTokenizer(str, " ");
            String time, name;
            try {
                time = stringTokenizer.nextToken();
                name = stringTokenizer.nextToken();
            } catch (Exception e) {
                break;
            }

            if (time.compareTo(conferenceStart) <= 0) {
                startCheck.add(name);
            } else if (time.compareTo(conferenceEnd) >= 0 && time.compareTo(streamingEnd) <= 0) {
                endCheck.add(name);
            }
        }
        for (String person : startCheck) {
            if (endCheck.contains(person)) {
                names.add(person);
            }
        }
        bufferedWriter.write(String.valueOf(names.size()));
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
