package silver_3;

import java.io.*;
import java.util.*;

public class NUM_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int numOfTestCase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < numOfTestCase; i++) {
            HashMap<String, HashSet<String>> set = new HashMap<>();
            int numOfCloth = Integer.parseInt(bufferedReader.readLine());
            for (int j = 0; j < numOfCloth; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                String name = stringTokenizer.nextToken();
                String group = stringTokenizer.nextToken();
                if(set.containsKey(group)){
                    HashSet<String> temp = set.get(group);
                    temp.add(name);
                    set.put(group, temp);
                }else{
                    HashSet<String> temp = new HashSet<>();
                    temp.add(name);
                    set.put(group, temp);
                }
            }
            Set<String> iterSet = set.keySet();
            int result = 1;
            for(String str : iterSet){
                result *= set.get(str).size()+1;
            }
            bufferedWriter.write(String.valueOf(result-1));
            bufferedWriter.write('\n');
        }
        bufferedWriter.flush();
    }
}
