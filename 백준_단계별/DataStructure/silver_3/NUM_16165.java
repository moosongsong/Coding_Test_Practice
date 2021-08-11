package silver_3;

import java.io.*;
import java.util.*;

public class NUM_16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        HashMap<String, TreeSet> groupToName = new HashMap<>();
        HashMap<String, String> nameToGroup = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String groupName = bufferedReader.readLine();
            int number0fMembers = Integer.parseInt(bufferedReader.readLine());
            TreeSet<String> names = new TreeSet<>();
            for (int j = 0; j < number0fMembers; j++) {
                String name = bufferedReader.readLine();
                names.add(name);
                nameToGroup.put(name, groupName);
            }
            groupToName.put(groupName, names);
        }
        for (int i = 0; i < M; i++) {
            String str = bufferedReader.readLine();
            int type = Integer.parseInt(bufferedReader.readLine());
            if (type == 0){
                TreeSet members = groupToName.get(str);
                for (Object member : members) {
                    bufferedWriter.write((String) member);
                    bufferedWriter.write('\n');
                }
            }else{
                bufferedWriter.write(nameToGroup.get(str));
                bufferedWriter.write('\n');
            }
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
